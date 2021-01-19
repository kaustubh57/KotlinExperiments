fun main() {
    // put your code here

    val grp1Count = readLine()!!.toInt()
    val grp2Count = readLine()!!.toInt()
    val grp3Count = readLine()!!.toInt()

    print("${grp1Count / 2 + grp1Count % 2 + grp2Count / 2 + grp2Count % 2 + grp3Count / 2 + grp3Count % 2}")
}
