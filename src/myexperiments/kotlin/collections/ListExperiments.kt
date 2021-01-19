package myexperiments.kotlin.collections

fun main() {
    //read only
    val names = listOf("Da", "Ha", "Ro", "Ch")
    println("The first word is ${names.get(0)}")
    println("The second word is ${names[1]}")

    //mutable
    var subNames = names.subList(1,3)
    println(subNames)

    val items = mutableListOf(2,4,6,7,8,9,10,15)
    items[0] = 1

    items.add(100)
    items.removeAt(3)
    items.remove(99)

    println("There are ${items.size} items in the list")
    println("The first item is ${items.first()}")

}