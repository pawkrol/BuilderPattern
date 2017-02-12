package main.apply

/**
 * Created by pawkrol on 2/12/17.
 */
//This is a Kotlin response for multiple setter calls on object - Kotlins "builder"
fun main(args: Array<String>){
    val orc = Orc().apply {
        skinColor = "black"
        height = 220
        name = "Shagrat"
        warrior = true
    }

    println(orc)
}