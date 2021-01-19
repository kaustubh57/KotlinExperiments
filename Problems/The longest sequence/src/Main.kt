import java.util.*

fun main(args: Array<String>) {
    val numberCount = readLine()!!.toInt()
    val numbers = readLine()!!.split(" ").map(String::toInt)

    var index = 0
    var consecutiveMaxCount = 0
    var currentConsecutiveMaxCount = 0

    repeat(numberCount) {
        if (index == 0) {
            currentConsecutiveMaxCount++
        } else {
            val previousValue = numbers[index - 1]
            val currentValue = numbers[index]

            if (currentValue < previousValue) {
                currentConsecutiveMaxCount = 1
            } else {
                currentConsecutiveMaxCount++
            }
        }

        if (currentConsecutiveMaxCount > consecutiveMaxCount) {
            consecutiveMaxCount = currentConsecutiveMaxCount
        }

        index++
    }

    println(consecutiveMaxCount)

}
