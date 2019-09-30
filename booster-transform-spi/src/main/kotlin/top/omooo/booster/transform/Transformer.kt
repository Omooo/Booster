package top.omooo.booster.transform

/**
 * Created by Omooo
 * Date: 2019-09-26
 * Desc:
 */
interface Transformer : TransformListener {

    fun transform(context: TransformContext, bytecode: ByteArray): ByteArray

}