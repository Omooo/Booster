package top.omooo.booster.transform.asm

import org.objectweb.asm.tree.ClassNode

/**
 * Created by Omooo
 * Date: 2019-09-26
 * Desc:
 */

val ClassNode.simpleName: String
    get() {
        return this.name.substring(this.name.lastIndexOf('/') + 1)
    }

val ClassNode.className: String
    get() {
        return this.name.replace('/', '.')
    }