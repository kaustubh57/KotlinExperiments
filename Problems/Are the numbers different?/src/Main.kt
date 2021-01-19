fun main() {
    // put your code here
    val input1 = readLine()!!.toInt()
    val input2 = readLine()!!.toInt()
    val input3 = readLine()!!.toInt()

    print(!(input1 == input2 || input2 == input3 || input3 == input1))
}
