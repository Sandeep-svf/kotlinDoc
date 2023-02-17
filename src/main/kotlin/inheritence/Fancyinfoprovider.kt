package inheritence

import codecamporg.classess.Person
import codecamporg.interfaces.BasicInfoProvider

class Fancyinfoprovider : BasicInfoProvider() {
    /*** by default classes are closed in kotlin..
     * they can not be inheritate or extended...
     * for extends class need to add open keywords to the class*/

    override val sessionIdProfix: String
        get() = "Fancy session"

    override val providerInfo: String
        get() = "Fancy info provider..."

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info...")
    }
}