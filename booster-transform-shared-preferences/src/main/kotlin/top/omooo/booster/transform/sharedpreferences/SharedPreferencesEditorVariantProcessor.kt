package top.omooo.booster.transform.sharedpreferences

import com.android.build.gradle.api.BaseVariant
import com.android.build.gradle.api.LibraryVariant
import com.android.build.gradle.internal.api.ApplicationVariantImpl
import com.google.auto.service.AutoService
import top.omooo.booster.spi.VariantProcessor

/**
 * Created by Omooo
 * Date: 2019-09-30
 * Desc:
 */

@AutoService(VariantProcessor::class)
class SharedPreferencesEditorVariantProcessor : VariantProcessor {

    override fun process(variant: BaseVariant) {
        if (variant !is LibraryVariant) {
            val variantData = (variant as ApplicationVariantImpl).variantData
            variantData.scope.globalScope.project.dependencies.add("implementation", "'top.omooo:instrument-shared-preferences:0.1.0'")
        }
    }
}