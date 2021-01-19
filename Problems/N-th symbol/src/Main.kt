fun main() {
    // write your code here
    val stringInput = readLine()!!
    val nthIndex = readLine()!!.toInt()

    print("Symbol # $nthIndex of the string \"$stringInput\" is '${stringInput[nthIndex - 1]}'")
}
