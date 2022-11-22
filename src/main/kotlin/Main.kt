fun main() {
    solution("ababc")
}

fun solution(s: String): String {
    val longestPalindrome = ArrayList<String>()
    for (i in s.indices) {
        for (j in s.length downTo 0) {
            val subString = s.substring(i, j)
            if (subString == subString.reversed()) {
                longestPalindrome.add(subString)
                break
            }
        }
    }

    return longestPalindrome.maxByOrNull { it.length } ?: "N/A"
}