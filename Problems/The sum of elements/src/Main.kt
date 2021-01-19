import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    var total = 0
    var terminatorFound = false
    while (!terminatorFound && scanner.hasNextInt()) {
        val nextNumber = scanner.nextInt()
        total += nextNumber
        if (nextNumber == 0) {
            terminatorFound = true
        }
    }

    println(total)
}
