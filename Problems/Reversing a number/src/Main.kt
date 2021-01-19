fun main() {
    // put your code here
    val inputNumber = readLine()!!.toInt()

    val hundredsDigit = inputNumber / 100

    val tensDigit = (inputNumber - 100 * hundredsDigit) / 10

    val unitsDigit = inputNumber - 100 * hundredsDigit - tensDigit * 10

    print("$unitsDigit$tensDigit$hundredsDigit")
}
