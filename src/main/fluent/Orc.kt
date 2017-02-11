package main.fluent

/**
 * Created by pawkrol on 2/11/17.
 */
class Orc private constructor(){
    var skinColor = ""
    var height = 0
    var name = ""
    var warrior = false

    private constructor(orcBuilder: OrcBuilder): this(){
        skinColor = orcBuilder.skinColor
        height = orcBuilder.height
        name = orcBuilder.name
        warrior = orcBuilder.warrior
    }

    override fun toString(): String {
        return "Orc(skinColor='$skinColor', height=$height, name='$name', warrior=$warrior)"
    }

    object OrcBuilder{
        var skinColor = ""
            private set

        var height = 0
            private set

        var name = ""
            private set

        var warrior = false
            private set

        fun skinColor(skinColor: String): OrcBuilder{
            this.skinColor = skinColor
            return this
        }

        fun height(height: Int): OrcBuilder{
            this.height = height
            return this
        }

        fun name(name: String): OrcBuilder{
            this.name = name
            return this
        }

        fun warrior(warrior: Boolean): OrcBuilder{
            this.warrior = warrior
            return this
        }

        fun build(): Orc{
            return Orc(this)
        }
    }
}