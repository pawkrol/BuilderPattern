package main.traditional.builders

import main.traditional.Orc

/**
 * Created by pawkrol on 2/10/17.
 */
abstract class OrcBuilder {
    lateinit var orc : Orc

    fun createNewOrc(){
        orc = Orc()
    }

    abstract fun buildSkin()
    abstract fun buildHeight()
    abstract fun buildName()
    abstract fun buildWarrior()
}