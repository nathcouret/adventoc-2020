package adventoc.day2

class Star1Password(
        private val password: String,
        private val min: Int,
        private val max: Int,
        private val letter: Char
) : Password {

    override fun isValid(): Boolean {
        var count = 0
        for (char in password) {
            if (char == letter) {
                count++
                if (count > max) {
                    return false
                }
            }
        }
        return count >= min
    }
}