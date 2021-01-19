fun main() {
    val char1 = readLine()!!.first()
    val char2 = readLine()!!.first()

    print(char1.equals(char2, ignoreCase = true))
}
