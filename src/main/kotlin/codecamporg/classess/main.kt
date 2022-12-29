package codecamporg.classess

fun main() {

    // creating new instense of a class
    // there is no new keywords
    // use onlt class name
 //   var person = Person("aarav","maurya")     // calling primary constructor..
   // var person = Person()           // calling secondary constructor...  by not providing parameter .

    var person = Person() // calling primary construcor .. default value assign in primary construcotr...

    // known as property access syntex...
 /*   person.firstName
    person.lastName
    person.nickName = "sam"
    person.nickName = "new nick name"

    println(person.nickName)    // using getter*/

    person.printInfo()

    /*** Getter and Setter in kotlin getting automatically by the compiler...
     * if val than getter generated
     * if var than getter and setter generated */



}