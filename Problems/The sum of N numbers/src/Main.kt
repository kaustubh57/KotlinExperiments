fun main(args: Array<String>) {
    // write your code here

    val numberCount = readLine()!!.toInt()
    val numbers = readLine()!!.split(" ").map(String::toInt)

    var index = 0
    var total = 0

    repeat(numberCount) {
        total += numbers[index]
        index++
    }

    println(total)
}
