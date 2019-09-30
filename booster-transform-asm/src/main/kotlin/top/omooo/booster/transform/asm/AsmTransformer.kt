package top.omooo.booster.transform.asm

import com.google.auto.service.AutoService
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode
import top.omooo.booster.transform.TransformContext
import top.omooo.booster.transform.Transformer
import java.util.*

/**
 * Created by Omooo
 * Date: 2019-09-29
 * Desc:
 */

@AutoService(Transformer::class)
class AsmTransformer : Transformer {

    private val transformers =
        ServiceLoader.load(ClassTransformer::class.java, javaClass.classLoader).toList()

    override fun transform(context: TransformContext, bytecode: ByteArray): ByteArray {
        return ClassWriter(ClassWriter.COMPUTE_MAXS).also { writer ->
            transformers.fold(ClassNode().also { klass ->
                ClassReader(bytecode).accept(klass, 0)
            }) { klass, transformer ->
                transformer.transform(context, klass)
            }.accept(writer)
        }.toByteArray()
    }

    override fun onPreTransform(context: TransformContext) {
        transformers.forEach {
            it.onPreTransform(context)
        }
    }

    override fun onPostTransform(context: TransformContext) {
        transformers.forEach {
            it.onPostTransform(context)
        }
    }

}