package top.omooo.booster.kotlinx

import java.io.PrintWriter
import java.io.StringWriter

/**
 * Created by Omooo
 * Date: 2019-09-26
 * Desc:
 */

val Throwable.stackTraceAsString: String
    get() = StringWriter().also {
        printStackTrace(PrintWriter(it))
    }.toString()