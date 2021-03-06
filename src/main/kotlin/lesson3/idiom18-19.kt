package lesson3

import java.util.ArrayList

/**
 * Lists and mutable lists
 */
fun main() {
    /**
     * This method creates a read-only list of strings. One should note that the type of the list is not specified
     */
    val list = listOf("a", "b", "c")

    println(list[0])

    /**
     * This one creates a mutable list
     */
    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")
    mutableList[2] = "d"
    mutableList.add("e")
    mutableList += "f"


    /**
     * This one creates a mutable ArrayList.
     */
    val arrayList: ArrayList<String> = arrayListOf("a", "b", "c")

    //Danger zone

    val newList: List<String> = list + "f" + mutableList

    println(newList)

    //Bonus

    val lambdaList = List(3){ it.toString() }
    println(lambdaList)
}

/**
 * idiom 19
 * Use shortcut function to provide default values
 */
fun doSomething(additionalArguments: List<String> = emptyList()){
    TODO()
    emptyArray<String>()
    emptySet<String>()
    emptyMap<String,String>()
}