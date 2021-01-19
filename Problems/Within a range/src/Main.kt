fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()
    val number5 = readLine()!!.toInt()

    println(number5 in number1..number2 || number5 in number3..number4)
}
