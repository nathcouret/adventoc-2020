package adventoc.day2

class Star2Password(
        private val password: String,
        private val pos1: Int,
        private val pos2: Int,
        private val letter: Char
) : Password {

    override fun isValid(): Boolean {
        val chars = password.toCharArray()
        return (chars[pos1-1] == letter) xor (chars[pos2-1] == letter)
    }
}