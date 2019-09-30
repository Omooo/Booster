package top.omooo.booster.transform.asm

import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.*

/**
 * Created by Omooo
 * Date: 2019-09-30
 * Desc:
 */

fun TypeInsnNode.transform(
    klass: ClassNode,
    method: MethodNode,
    instantializer: TypeInsnNode,
    type: String,
    prefix: String = ""
) {
    var next: AbstractInsnNode? = this.next
    loop@ while (null != next) {
        if (Opcodes.INVOKESPECIAL != next.opcode) {
            next = next.next
            continue
        }
        val invoke = next as MethodInsnNode
        if (this.desc == invoke.owner && "<init>" == invoke.name) {
            invoke.owner = type
            invoke.name =
                "new$prefix${instantializer.desc.substring(instantializer.desc.lastIndexOf('/') + 1)}"
            invoke.desc =
                "${invoke.desc.substring(0, invoke.desc.lastIndexOf(')'))})L${instantializer.desc}"
            invoke.opcode = Opcodes.INVOKESTATIC
            invoke.itf = false

            val dup = instantializer.next
            if (Opcodes.DUP == dup.opcode) {
                method.instructions.remove(dup)
            } else {
                TODO("Unexpected instruction ${dup.opcode}:${klass.name}.${method.name}${method.desc}")
            }
            method.instructions.remove(instantializer)
            break@loop
        }
        next = next.next
    }
}