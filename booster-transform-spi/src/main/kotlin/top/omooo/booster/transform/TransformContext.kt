package top.omooo.booster.transform

import java.io.File
import java.util.concurrent.ExecutorService

/**
 * Created by Omooo
 * Date: 2019-09-26
 * Desc:
 */
interface TransformContext {

    val name: String

    val projectDir: File

    val buildDir: File

    val temporaryDir: File

    val reportsDir: File

    val executor: ExecutorService

    val bootClasspath: Collection<File>

    val compileClasspath: Collection<File>

    val runtimeClasspath: Collection<File>

    val artifacts: ArtifactManager

    val klassPool: KlassPool

    val applicationId: String

    val originalApplicationId: String

    val isDebuggable: Boolean

    fun hasProperty(name: String): Boolean

    fun getProperty(name: String): String?
}