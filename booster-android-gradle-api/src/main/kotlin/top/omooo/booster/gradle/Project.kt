package top.omooo.booster.gradle

import com.android.build.gradle.BaseExtension
import com.android.repository.Revision
import org.gradle.api.Project

/**
 * Created by Omooo
 * Date: 2019-10-10
 * Desc:
 */

inline fun <reified T : BaseExtension> Project.getAndroid(): T =
    extensions.getByName("android") as T

/**
 * The gradle version
 */
val Project.gradleVersion: Revision
    get() = Revision.parseRevision(gradle.gradleVersion)

val Project.aapt2Enabled: Boolean
    get() = true