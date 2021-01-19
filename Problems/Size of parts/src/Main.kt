fun main(args: Array<String>) {
    // put your code here
    val inputParts = readLine()!!.toInt()

    var largerPartCount = 0
    var smallerPartCount = 0
    var perfectPartCount = 0

    repeat(inputParts) {
        val partStatus = readLine()!!.toInt()
        if (partStatus == -1) {
            smallerPartCount++
        } else if (partStatus == 1) {
            largerPartCount++
        } else if (partStatus == 0) {
            perfectPartCount++
        }
    }

    println("$perfectPartCount $largerPartCount $smallerPartCount")
}
