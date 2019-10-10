package top.omooo.booster.plugin

import com.android.build.api.transform.*
import top.omooo.booster.transform.*
import java.io.File
import java.util.*
import java.util.concurrent.ExecutorService

/**
 * Created by Omooo
 * Date: 2019-09-30
 * Desc:
 */
internal class BoosterTransformInvocation(private val delegate: TransformInvocation) :

    TransformInvocation, TransformContext, TransformListener, ArtifactManager {
    private val transforms =
        ServiceLoader.load(Transformer::class.java, javaClass.classLoader).toList()

    override val name: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val projectDir: File
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val buildDir: File
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val temporaryDir: File
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val reportsDir: File
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val executor: ExecutorService
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val bootClasspath: Collection<File>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val compileClasspath: Collection<File>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val runtimeClasspath: Collection<File>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val artifacts: ArtifactManager
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val klassPool: KlassPool
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val applicationId: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val originalApplicationId: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val isDebuggable: Boolean
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun hasProperty(name: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getProperty(name: String): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInputs(): MutableCollection<TransformInput> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSecondaryInputs(): MutableCollection<SecondaryInput> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getReferencedInputs(): MutableCollection<TransformInput> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isIncremental(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getOutputProvider(): TransformOutputProvider {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getContext(): Context {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}