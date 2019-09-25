package top.omooo.booster.spi

import com.android.build.gradle.api.BaseVariant

/**
 * Created by Omooo
 * Date: 2019-09-25
 * Desc: Task 注册接口
 */
interface VariantProcessor {

    fun process(variant: BaseVariant)

}