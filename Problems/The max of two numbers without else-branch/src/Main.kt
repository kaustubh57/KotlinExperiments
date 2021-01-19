fun main(args: Array<String>) {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    var max = a
    if (b > a) max = b

    println(max)
}
