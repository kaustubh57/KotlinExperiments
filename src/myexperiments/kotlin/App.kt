package myexperiments.kotlin

class App {
}

fun main() {
    println("1st program")

    val cardPoints = 1000

    val cardLevel: String = if (cardPoints >= 0 && cardPoints < 1000) {
        "pearl"
    } else if (cardPoints >= 1000 && cardPoints < 5_000) {
        "silver"
    } else if (cardPoints >= 5_000 && cardPoints < 10_000) {
        "gold"
    } else {
        "platinum"
    }

    val plural = if (cardPoints > 1 || cardPoints == 0) "s" else ""

    println("1. You have $cardPoints point$plural and are at the $cardLevel level.")

    val cardLevel2 = when(cardPoints) {
        in 0..999 -> "pearl"
        in 1000..4999 -> "silver"
        in 5000..9999 -> "gold"
        else -> "platinum"
    }

    println("2. You have $cardPoints point$plural and are at the $cardLevel2 level.")
}