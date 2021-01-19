import java.util.*

fun main(args: Array<String>) {
    // write your code here
    val scanner = Scanner(System.`in`)

    val cups = scanner.nextInt()
    val isWeekend: Boolean = scanner.nextBoolean()
    println((isWeekend && cups in 15..25) || (!isWeekend && cups in 10..20))

    scanner.close()
}