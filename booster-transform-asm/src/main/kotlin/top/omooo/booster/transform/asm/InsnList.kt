package top.omooo.booster.transform.asm

import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.InsnList
import top.omooo.booster.kotlinx.asIterable

/**
 * Created by Omooo
 * Date: 2019-09-29
 * Desc:
 */

fun InsnList.find(opcode: Int): AbstractInsnNode? {
    return this.iterator().asIterable().find {
        it.opcode == opcode
    }
}

fun InsnList.findAll(vararg opcodes: Int): Collection<AbstractInsnNode> {
    return this.iterator().asIterable().filter {
        it.opcode in opcodes
    }.toList()
}