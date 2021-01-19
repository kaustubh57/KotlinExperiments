fun main(args: Array<String>) {
    // put your code here
    val n = readLine()!!.toInt()

    var squareOf = 1
    while (squareOf * squareOf <= n) {
        println(squareOf * squareOf)
        squareOf++
    }
}
