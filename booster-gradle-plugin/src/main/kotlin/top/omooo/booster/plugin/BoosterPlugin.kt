package top.omooo.booster.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by Omooo
 * Date: 2019-09-25
 * Desc: Booster Plugin
 */
class BoosterPlugin : Plugin<Project> {
    override fun apply(p0: Project) {
        println(
            """
            /********************************/
            /******** Booster Plugin ********/
            /********************************/
        """.trimIndent()
        )
    }
}