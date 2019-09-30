package top.omooo.booster.transform.asm

import org.objectweb.asm.tree.ClassNode
import top.omooo.booster.transform.TransformContext
import top.omooo.booster.transform.TransformListener

/**
 * Created by Omooo
 * Date: 2019-09-29
 * Desc:
 */
interface ClassTransformer : TransformListener {

    fun transform(context: TransformContext, klass: ClassNode) = klass

}