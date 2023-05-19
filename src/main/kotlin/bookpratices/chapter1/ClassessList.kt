package bookpratices.chapter1

data class ClassessList(val firstName : String, val lastName : String)

    /***
     * Kotlin is an open-source programming language. It is, most
     * notably, statically typed and object-oriented. Statically typed
     * means that variables have types when you write your code and
     * compile it, and those types are fixed.
     * */

    //What Does Kotlin Add to Java?

    /***
     * Kotlin ditches NullPointerException (and nullable
     * variables altogether) in almost all situations.
     * Kotlin supports extending functions without having to
     * entirely override a parent class.
     * Kotlin doesn't support checked exceptions (you may not
     * find this to be an advancement, so fair warning).
     * Kotlin adds components of functional programming, such
     * as extensive lambda support and lazy evaluation.
     * Kotlin defines data classes that let you skip writing basic
     * getters and setters.
     *
     * */

    //KOTLIN IS OBJECT-ORIENTED


    class User {
    }

    // creating userful obj


    fun main(){


        // creatinhg obj of User class
        val sam = User()


        val brain = ClassessList("Aarav","Maurya")
        val rose = ClassessList("Sandeep","Maurya")

        val attendees: MutableList<ClassessList> = mutableListOf(brain,rose)
        attendees.forEach {
                classessList -> println("$classessList is attendig!")
        }
}
