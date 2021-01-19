package myexperiments.kotlin.operations

fun main() {
    var a = 5
    val b = 9
    val c = 11
    var d = 2
    d *= ++a + b%(c - 3) // order of execution in this line
    println(d)
}
