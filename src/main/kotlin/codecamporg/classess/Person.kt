package codecamporg.classess

// if class doesn't have any propertied than we can ommit carly brackets
class Person constructor(val firstName : String = "aarav" , val lastName : String = "maurya") {

    var nickName : String?   = null
        set(value)  {
            field = value
            println("new nickName is $value")
        }

        get() {
            println("the return value is $field")
            return field
        }

    fun printInfo() {
        val nickNameToPrint = if(nickName != null ) nickName else "no nickName"  // can be written also

        val nickNameToPrint2 = nickName ?: "no nick name is given to this user"

      //  println("$firstName ( $nickNameToPrint ) $lastName")
        println("$firstName ( $nickNameToPrint2 ) $lastName")
    }

  /***  // Property must be initialized or be abstract

    val firstName : String
    val lastName : String */

/***    // we can initializ in different way
    // init block
    // can have multiple init block...
  val firstName : String
    val lastName : String

    init {
        firstName = _firstName
        lastName = _lastName
    }*/

    // can be joined with assinment
   /* val firstName : String = _firstName
    val lastName : String = _lastName*/


    // we can also declear properties directly in the constructor...


    // secondary constructor...
    /*** secondary constructor... can provide alternative means for you to instatiate and instance of class*/


  /*  init {
        println("inti 1")
    }
    constructor(): this("aaraav","maurya") {
        // body
        println("This is secondary constructor...")
    }

    init {
        println("init 2")
    }*/

}

