fun main(args: Array<String>) {
    // put your code here
    val numberCount = readLine()!!.toInt()

    var dGradeCount = 0
    var cGradeCount = 0
    var bGradeCount = 0
    var aGradeCount = 0

    repeat(numberCount) {
        val grade = readLine()!!.toInt()

        if (grade == 5) {
            aGradeCount++
        } else if (grade == 4) {
            bGradeCount++
        } else if (grade == 3) {
            cGradeCount++
        } else if (grade == 2) {
            dGradeCount++
        }
    }

    println("$dGradeCount $cGradeCount $bGradeCount $aGradeCount")
}
