fun main() {
    // put your code here
    val repeatCount = readLine()!!.toInt()

    var maxDivisibleFour = 0

    repeat(repeatCount) {
        val input = readLine()!!.toInt()
        if (input % 4 == 0 && input > maxDivisibleFour) {
            maxDivisibleFour = input
        }
    }

    print(maxDivisibleFour)
}
