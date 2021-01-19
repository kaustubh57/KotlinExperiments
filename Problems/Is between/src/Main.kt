fun main() {
    val input1 = readLine()!!.toInt()
    val input2 = readLine()!!.toInt()
    val input3 = readLine()!!.toInt()

    when (input1) {
        in input3..input2 -> {
            println(true)
        }
        in input2..input3 -> {
            println(true)
        }
        else -> {
            println(false)
        }
    }
}
