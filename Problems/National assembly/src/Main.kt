import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)

    val population = scanner.nextInt()

    println(Math.cbrt(population.toDouble()).toInt())
}
