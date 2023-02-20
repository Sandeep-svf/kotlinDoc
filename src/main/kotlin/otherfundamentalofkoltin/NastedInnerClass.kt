package otherfundamentalofkoltin

fun main(){

    // Nested class
    // a class which is created inside another class
    // in kotlin nested class by default static -> So it's data member and member function can be access without
    // creating object of the class.
    //Nested class can't access data member of the outer class  ( One way relationship)

    var nestedclassObj = OuterClass.NestedClass()   // Object Creation
    println(OuterClass.NestedClass().description)   // Accessing the properties
    println(nestedclassObj.foo())   //Access member function




    // Inner class
    // a class which is created inside another class with keyword inner
    // in another word a nested class mark with inner keyword called inner class
    // innerclass can't be declared inside interfaces or non-inner nested class
    // Able to access member of it outer class even it is private
    // innerclass keep to a reference to an object of it's outer class

    var innerClassObj = OuterClass2().InnerClass() // Object Creation
    println(OuterClass2().InnerClass().description) // accessing property
    println(innerClassObj.foo()) // access memner funciton


}


class OuterClass2{
    // OuterClass2 code
    private var name : String = "Aarav Maurya"
    inner class InnerClass{
        // inner class code
        var description : String = "code inside inner class"
        private var id: Int = 101

        fun foo(){
            println("Kid name is: $name")   // access the private outside class member
            println("Kid id is: $id")
        }


    }
}

class OuterClass{
    // outer class code
    private var name : String = "Aarav maurya"
    class NestedClass{
        //nested class code
        var description : String= "Code inside nested class"
        private var id : Int = 101
        fun foo(){
            //print("name is $name")   // can't access the outer class member
            println("Id is: $id")
        }
    }
}