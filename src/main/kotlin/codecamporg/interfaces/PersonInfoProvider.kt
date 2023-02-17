package codecamporg.interfaces

import codecamporg.classess.Person
import inheritence.Fancyinfoprovider

interface PersonInfoProvider {

    /*** we can provide properties on interface ...*/

    val providerInfo : String       // can't assign value , properties initializer are not allow to interfaces...


    fun printInfo (person: Person){

        println(providerInfo)
        person.printInfo()
    }
}

interface SesstinInfoProvider {
    fun getSessionId() : String

}

/*** // if define call as abstract class.. that means it don't have to implement all fun of interface
// can not create instanse of an abstract class...*/

  open class BasicInfoProvider : PersonInfoProvider , SesstinInfoProvider{
    /*  override fun printInfo(person: Person) {

          println("Basic info provider")
          person.printInfo()
      }*/

    // override providerInfo properties..
    override val providerInfo: String
        get() = "basicInfoProvidersam"

    open val sessionIdProfix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional println statement ...")
    }


    override fun getSessionId(): String {
        return sessionIdProfix
    }
  }


fun checkTypes(infoProvider: PersonInfoProvider){
    if(infoProvider is SesstinInfoProvider){
        println("Session info provider..")
        (infoProvider as SesstinInfoProvider).getSessionId()    // cast and user methods and properties...
    }else{
        println("not a session info provider...")
    }
}

fun main() {
//    val provider = BasicInfoProvider()
    val provider = Fancyinfoprovider()

    provider.printInfo(Person())
    provider.getSessionId()
    checkTypes(provider)
}
