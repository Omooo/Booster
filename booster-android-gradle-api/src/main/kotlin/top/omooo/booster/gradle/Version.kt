package top.omooo.booster.gradle

import com.android.repository.Revision

/**
 * Created by Omooo
 * Date: 2019-10-10
 * Desc:
 */

internal val ANDROID_GRADLE_PLUGIN_VERSION = Revision.parseRevision("3.5.0")

val GTE_V3_X = ANDROID_GRADLE_PLUGIN_VERSION.major >= 3
val GTE_V3_5 = GTE_V3_X && ANDROID_GRADLE_PLUGIN_VERSION.minor >= 5
val GTE_V3_4 = GTE_V3_X && ANDROID_GRADLE_PLUGIN_VERSION.minor >= 4
val GTE_V3_3 = GTE_V3_X && ANDROID_GRADLE_PLUGIN_VERSION.minor >= 3
val GTE_V3_2 = GTE_V3_X && ANDROID_GRADLE_PLUGIN_VERSION.minor >= 2
val GTE_V3_1 = GTE_V3_X && ANDROID_GRADLE_PLUGIN_VERSION.minor >= 1