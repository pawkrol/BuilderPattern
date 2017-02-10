package main.builders

/**
 * Created by pawkrol on 2/10/17.
 */
class BlackUruksBuilder : OrcBuilder(){

    override fun buildSkin(){
        orc.skinColor = "black"
    }

    override fun buildHeight() {
        orc.height = 220
    }

    override fun buildName() {
        orc.name = "Shagrat"
    }

    override fun buildWarrior() {
        orc.warrior = true
    }
}