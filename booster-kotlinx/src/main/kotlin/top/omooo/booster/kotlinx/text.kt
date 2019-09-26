package top.omooo.booster.kotlinx

import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Created by Omooo
 * Date: 2019-09-26
 * Desc:
 */

fun String.separatorsToUnix(): String {
    return if ('/' == File.separatorChar) this else this.replace(File.separatorChar, '/')
}

fun String.separatorsToSystem(): String {
    return if ('/' != File.separatorChar && this.contains('/')) this.replace(
        '/',
        File.separatorChar
    ) else this
}

fun String.md5(): String {
    return BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16)
        .padStart(32, '0')
}

fun String.matches(wildcard: Wildcard): Boolean {
    return wildcard.matches(this)
}