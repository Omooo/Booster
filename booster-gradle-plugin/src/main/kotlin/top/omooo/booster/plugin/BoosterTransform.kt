package top.omooo.booster.plugin

import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform
import com.android.build.api.transform.TransformInvocation
import com.android.build.gradle.internal.pipeline.TransformManager

/**
 * Created by Omooo
 * Date: 2019-09-30
 * Desc:
 */
abstract class BoosterTransform : Transform() {
    override fun getName() = "booster"

    override fun getInputTypes(): MutableSet<QualifiedContent.ContentType> =
        TransformManager.CONTENT_CLASS

    override fun isIncremental() = true

    final override fun transform(transformInvocation: TransformInvocation?) {
        transformInvocation?.let {

        }
    }

    private fun dumpInputs(invocation: BoosterTransformInvocation) {

    }
}