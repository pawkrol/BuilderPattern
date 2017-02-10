package main.builders

/**
 * Created by pawkrol on 2/10/17.
 */
class UrukHaiBuilder : OrcBuilder(){
    override fun buildSkin() {
        orc.skinColor = "swart"
    }

    override fun buildHeight() {
        orc.height = 200
    }

    override fun buildName() {
        orc.name = "Ugluk"
    }

    override fun buildWarrior() {
        orc.warrior = true
    }

}