import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var index = 1
    var largeNumber = 0
    var secondLargeNumberFound = false
    var largeNumberPosition = 0

    while (!secondLargeNumberFound && scanner.hasNextInt()) {
        val number = scanner.nextInt()
        if (largeNumberPosition > 0) {
            if (number == largeNumber) {
                secondLargeNumberFound = true
            }
        }

        if (index == 1 || number > largeNumber) {
            largeNumber = number
            largeNumberPosition = index
        }
        index++
    }

    println("$largeNumber $largeNumberPosition")
}
