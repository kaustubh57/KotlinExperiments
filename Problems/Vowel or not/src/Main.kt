// write your function here

fun main() {

    val letter = readLine()!!.first()

    println(isVowel(letter))
}

fun isVowel(letter: Char): Boolean {
    val charToVerify = letter.toUpperCase()
    return charToVerify == 'A' ||
            charToVerify == 'E' ||
            charToVerify == 'I' ||
            charToVerify == 'O' ||
            charToVerify == 'U'
}
