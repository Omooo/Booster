package top.omooo.booster.task

import com.android.build.gradle.api.BaseVariant
import com.android.build.gradle.internal.api.ApplicationVariantImpl
import com.google.auto.service.AutoService
import top.omooo.booster.spi.VariantProcessor

/**
 * Created by Omooo
 * Date: 2019-09-25
 * Desc: 注册 ListPermissionTask
 */
@AutoService(VariantProcessor::class)
class ListPermissionVariantProcessor : VariantProcessor {
    override fun process(variant: BaseVariant) {
        val variantData = (variant as ApplicationVariantImpl).variantData
        val tasks = variantData.scope.globalScope.project.tasks
        tasks.create("listPermissions", ListPermissionTask::class.java)
    }
}