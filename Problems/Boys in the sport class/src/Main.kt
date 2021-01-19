fun main() {
    val input1 = readLine()!!.toInt()
    val input2 = readLine()!!.toInt()
    val input3 = readLine()!!.toInt()

    when (input2) {
        in input1..input3 -> {
            println(true)
        }
        in input3..input1 -> {
            println(true)
        }
        else -> {
            println(false)
        }
    }
}
