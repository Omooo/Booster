package top.omooo.booster.kotlinx

/**
 * Created by Omooo
 * Date: 2019-09-26
 * Desc:
 */
const val ESC = '\u001B'

const val CSI_RESET = "$ESC[0m"

const val CSI_BOLD = "$ESC[1m"
const val CSI_UNDERLINE = "$ESC[4m"
const val CSI_BLINK = "$ESC[5m"
const val CSI_REVERSED = "$ESC[7m"

const val CSI_BLACK = "$ESC[30m"
const val CSI_RED = "$ESC[31m"
const val CSI_GREEN = "$ESC[32m"
const val CSI_YELLOW = "$ESC[33m"
const val CSI_BLUE = "$ESC[34m"
const val CSI_MAGENTA = "$ESC[35m"
const val CSI_CYAN = "$ESC[36m"
const val CSI_WHITE = "$ESC[37m"
const val CSI_BRIGHT_BLACK = "$ESC[30,1m"
const val CSI_BRIGHT_RED = "$ESC[31,1m"
const val CSI_BRIGHT_GREEN = "$ESC[32,1m"
const val CSI_BRIGHT_YELLOW = "$ESC[33,1m"
const val CSI_BRIGHT_BLUE = "$ESC[34,1m"
const val CSI_BRIGHT_MAGENTA = "$ESC[35,1m"
const val CSI_BRIGHT_CYAN = "$ESC[36,1m"
const val CSI_BRIGHT_WHITE = "$ESC[37,1m"

const val CSI_BACKGROUND_BLACK = "$ESC[40m"
const val CSI_BACKGROUND_RED = "$ESC[41m"
const val CSI_BACKGROUND_GREEN = "$ESC[42m"
const val CSI_BACKGROUND_YELLOW = "$ESC[43m"
const val CSI_BACKGROUND_BLUE = "$ESC[44m"
const val CSI_BACKGROUND_MAGENTA = "$ESC[45m"
const val CSI_BACKGROUND_CYAN = "$ESC[46m"
const val CSI_BACKGROUND_WHITE = "$ESC[47m"
const val CSI_BACKGROUND_BRIGHT_BLACK = "$ESC[40,1m"
const val CSI_BACKGROUND_BRIGHT_RED = "$ESC[41,1m"
const val CSI_BACKGROUND_BRIGHT_GREEN = "$ESC[42,1m"
const val CSI_BACKGROUND_BRIGHT_YELLOW = "$ESC[43,1m"
const val CSI_BACKGROUND_BRIGHT_BLUE = "$ESC[44,1m"
const val CSI_BACKGROUND_BRIGHT_MAGENTA = "$ESC[45,1m"
const val CSI_BACKGROUND_BRIGHT_CYAN = "$ESC[46,1m"
const val CSI_BACKGROUND_BRIGHT_WHITE = "$ESC[47,1m"