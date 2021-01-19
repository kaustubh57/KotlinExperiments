fun main(args: Array<String>) {
    // write your code here
    val (startRange, endRange) = readLine()!!.split(" ").map(String::toInt)

    for (x in startRange..endRange) {
        if (x % 3 == 0 || x % 5 == 0) {
            if (x % 3 == 0) {
                print("Fizz")
            }
            if (x % 5 == 0) {
                print("Buzz")
            }
            println()
        } else {
            println(x)
        }
    }
}
