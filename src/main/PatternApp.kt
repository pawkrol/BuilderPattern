package main

import main.builders.BlackUruksBuilder
import main.builders.UrukHaiBuilder
import main.director.Mordor

/**
 * Created by pawkrol on 2/10/17.
 */
fun main(args: Array<String>) {
    val mordor = Mordor()
    val urukHaiBuilder = UrukHaiBuilder()
    val blackUruksBuilder = BlackUruksBuilder()

    mordor.setOrcBuilder(urukHaiBuilder)
    mordor.constructOrc()

    var orc = mordor.getOrc()
    println(orc)

    mordor.setOrcBuilder(blackUruksBuilder)
    mordor.constructOrc()

    orc = mordor.getOrc()
    println(orc)
}