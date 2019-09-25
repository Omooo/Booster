package top.omooo.booster.plugin

import com.android.build.gradle.AppExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import top.omooo.booster.spi.VariantProcessor
import java.util.*

/**
 * Created by Omooo
 * Date: 2019-09-25
 * Desc: Booster Plugin
 */
class BoosterPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        println(
            """
            /********************************/
            /******** Booster Plugin ********/
            /********************************/
        """.trimIndent()
        )

        when {
            project.plugins.hasPlugin("com.android.application") -> project.extensions.getByType(
                AppExtension::class.java
            ).let { android ->
                project.afterEvaluate {
                    ServiceLoader.load(VariantProcessor::class.java, javaClass.classLoader)
                        .toList().let { processes ->
                            android.applicationVariants.forEach { variant ->
                                processes.forEach {
                                    it.process(variant)
                                }
                            }
                        }
                }
            }

            project.plugins.hasPlugin("com.android.library") -> project.extensions.getByType(
                LibraryExtension::class.java
            ).let { android ->
                project.afterEvaluate {
                    ServiceLoader.load(VariantProcessor::class.java, javaClass.classLoader)
                        .toList().let { processes ->
                            android.libraryVariants.forEach { variant ->
                                processes.forEach {
                                    it.process(variant)
                                }
                            }
                        }

                }
            }
        }
    }
}