fun main() {
    val input1 = readLine()!!.toInt()
    val input2 = readLine()!!.toInt()
    val input3 = readLine()!!.toInt()

    if (input1 > 0 && (input2 > 0 || input3 > 0)) {
        println(false)
    } else if (input2 > 0 && (input1 > 0 || input3 > 0)) {
        println(false)
    } else if (input3 > 0 && (input1 > 0 || input2 > 0)) {
        println(false)
    } else {
        println(true)
    }
}
