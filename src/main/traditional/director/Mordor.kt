package main.traditional.director

import main.traditional.Orc
import main.traditional.builders.OrcBuilder

/**
 * Created by pawkrol on 2/10/17.
 */
class Mordor {
    private var orcBuilder : OrcBuilder? = null

    fun setOrcBuilder(orcBuilder: OrcBuilder){
        this.orcBuilder = orcBuilder
    }

    fun getOrc() : Orc? {
        return orcBuilder!!.orc
    }

    fun constructOrc(){
        orcBuilder?.createNewOrc()
        orcBuilder?.buildHeight()
        orcBuilder?.buildName()
        orcBuilder?.buildSkin()
        orcBuilder?.buildWarrior()
    }
}