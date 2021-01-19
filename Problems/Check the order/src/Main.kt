fun main(args: Array<String>) {
    val numberCount = readLine()!!.toInt()
    val numbers = readLine()!!.split(" ").map(String::toInt)

    var isConsecutive = true
    for (n in 1 until numberCount) {
        val prevValue = numbers[n - 1]
        val currValue = numbers[n]
        if (currValue < prevValue) {
            isConsecutive = false
            break
        }
    }

    println(if (isConsecutive) "YES" else "NO")
}
