package main.director

import main.Orc
import main.builders.OrcBuilder

/**
 * Created by pawkrol on 2/10/17.
 */
class Mordor {
    private var orcBuilder : OrcBuilder? = null

    fun setOrcBuilder(orcBuilder: OrcBuilder){
        this.orcBuilder = orcBuilder
    }

    fun getOrc() : Orc? {
        return orcBuilder?.orc
    }

    fun constructOrc(){
        orcBuilder?.createNewOrc()
        orcBuilder?.buildHeight()
        orcBuilder?.buildName()
        orcBuilder?.buildSkin()
        orcBuilder?.buildWarrior()
    }
}