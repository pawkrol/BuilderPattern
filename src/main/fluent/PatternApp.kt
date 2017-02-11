package main.fluent

/**
 * Created by pawkrol on 2/11/17.
 */
fun main(args: Array<String>){
    val orc: Orc = Orc.OrcBuilder
            .skinColor("black")
            .height(220)
            .name("Shagrat")
            .warrior(true)
            .build()

    println(orc)
}