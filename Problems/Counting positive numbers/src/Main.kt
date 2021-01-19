fun main(args: Array<String>) {
    // put your code here
    val repeatCount = readLine()!!.toInt()
    val numbers = readLine()!!.split(" ").map(String::toInt)

    var positiveNumberCount = 0
    var index = 0

    repeat(repeatCount) {
        val inputNumber = numbers[index]
        if (inputNumber > 0) {
            positiveNumberCount++
        }
        index++
    }

    println(positiveNumberCount)
}
