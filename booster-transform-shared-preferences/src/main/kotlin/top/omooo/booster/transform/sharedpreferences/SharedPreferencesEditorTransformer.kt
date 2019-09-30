package top.omooo.booster.transform.sharedpreferences

import com.google.auto.service.AutoService
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import top.omooo.booster.kotlinx.asIterable
import top.omooo.booster.transform.TransformContext
import top.omooo.booster.transform.asm.ClassTransformer
import java.io.PrintWriter

/**
 * Created by Omooo
 * Date: 2019-09-30
 * Desc:
 */

@AutoService(ClassTransformer::class)
class SharedPreferencesEditorTransformer : ClassTransformer {

    private companion object {
        const val SHARED_PREFERENCES_EDITOR = "android/content/SharedPreferences\$Editor"
        const val SHADOW_EDITOR = "top/omooo/booster/instrument/ShadowEditor"
    }

    private lateinit var logger: PrintWriter

    override fun onPreTransform(context: TransformContext) {
//        this.logger = context.reportsDir.file()
    }

    override fun onPostTransform(context: TransformContext) {

    }

    override fun transform(context: TransformContext, klass: ClassNode): ClassNode {
        if (klass.name == SHADOW_EDITOR) {
            return klass
        }
        klass.methods.forEach { method ->
            method.instructions?.iterator()?.asIterable()
                ?.filterIsInstance(MethodInsnNode::class.java)?.filter {
                    it.opcode == Opcodes.H_INVOKEINTERFACE && it.owner == SHARED_PREFERENCES_EDITOR
                }?.forEach { invoke ->
                    when ("${invoke.name}${invoke.desc}") {
                        "commit()Z" -> if (Opcodes.POP == invoke.next?.opcode) {
                            // if the return value of commit() does not used
                            // use asynchronous commit() instead
                            invoke.optimize(klass, method)
                            method.instructions.remove(invoke.next)
                        }
                        "apply()V" -> invoke.optimize(klass, method)
                    }
                }
        }
        return klass
    }

    private fun MethodInsnNode.optimize(klass: ClassNode, method: MethodNode) {
        this.itf = false
        this.owner = SHADOW_EDITOR
        this.name = "apply"
        this.opcode = Opcodes.INVOKESTATIC
        this.desc = "(L$SHARED_PREFERENCES_EDITOR;)V"
    }
}