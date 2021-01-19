import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    var numOfBlocks = 0
    while (numOfBlocks < 5) {
        val textInput = scanner.next()
            .replace("\n", " ")
            .split(" ")
        numOfBlocks += textInput.size
        for (text in textInput) {
            println(text)
        }
    }

    scanner.close()
}