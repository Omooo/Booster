package top.omooo.booster.transform

/**
 * Created by Omooo
 * Date: 2019-09-26
 * Desc:
 */
interface Klass {
    val qualifiedName: String
    fun isAssignableFrom(type: String): Boolean
    fun isAssignableFrom(klass: Klass): Boolean
}