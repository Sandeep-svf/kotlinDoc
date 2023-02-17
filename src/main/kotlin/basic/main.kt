package basic

// Program entry point

/*** An entry point of a Kotlin application is the main function. */
fun main2() {
    println("Hello Kotlin...!")
}

/*** Another form of main accepts a variable number of String arguments. */


/*** Variables */

// You can declare variables at the top level.
val PI = 3.14
var x = 0

fun incrementX() {
    x += 1
}

fun main(args: Array<String>) {
    println(args.contentToString())

    /*** Print to the standard output */

    print("Hello ")
    print("Sam!")

    // println prints its arguments and adds a line break,
    // so that the next thing you print appears on the next line.

    println("Hello world!")
    println(42)

    println(sum(40,40))
    println(sum2(10,10))
    printSum(3,9)


    /*** Variables */

    // Read-only local variables are defined using the keyword val. They can be assigned a value only once.

    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment


    /*** Variables that can be reassigned use the var keyword. */
    var x = 5 // `Int` type is inferred
    x += 1



    /*** Creating classes and instances */
    // To define a class, use the class keyword.
    class Shape

    //Properties of a class can be listed in its declaration or body.
    class Rectangle(var height: Double, var length: Double) {
        var perimeter = (height + length) * 2
    }

    /*** The default constructor with parameters listed in the class declaration is available automatically. */
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")

    /*** Inheritance between classes is declared by a colon (:). Classes are final by default;
     * to make a class inheritable, mark it as open. */

    open class Shape2

    class Rectangle2(var height: Double, var length: Double): Shape2() {
        var perimeter = (height + length) * 2
    }

    /*** String templates */

    var a1 = 1
// simple name in template:
    val s1 = "a1 is $a1"

    a1 = 2
// arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a1"
    println(s2)
    println(maxOf(10,15))

    /*** Conditional expressions */
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }



    /*** In Kotlin, if can also be used as an expression. */
    fun maxOf2(a: Int, b: Int) = if (a > b) a else b

    println(maxOf2(32,99))

    /*** for loop */
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    //OR

   // val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    /*** while loop */
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    /** when expression */

   // Need to clear...

    fun describe(obj: Any): String =
        when (obj) {
            1          -> "One"
            "Hello"    -> "Greeting"
            is Long    -> "Long"
            !is String -> "Not a string"
            else       -> "Unknown"
        }

    /*** Ranges */
    /*** Check if a number is within a range using in operator. */
    val x2 = 10
    val y = 9
    if (x2 in 1..y+1) {
        println("x2 fits in range")
    }

    // Check if a number is out of range.
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println(list.size)
        println(list.indices)
        
        println("list size is out of valid list indices range, too")
    }

    /*** Iterate over a range. */
    for (x in 1..10) {
        print(x)
    }

    /*** Collections */

    /*** Nullable values and null checks */
    // A reference must be explicitly marked as nullable when null value is possible.
    // Nullable type names have ? at the end.

    /*** Return null if str does not hold an integer: */
    fun parseInt(str: String): Int? {
        // ...
        return TODO("Provide the return value")
    }




    // Use a function returning nullable value:
    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        // Using `x * y` yields error because they may hold nulls.
        if (x != null && y != null) {
            // x and y are automatically cast to non-nullable after null check
            println(x * y)
        }
        else {
            println("'$arg1' or '$arg2' is not a number")
        }
    }

}


/*** Functions */

// A function with two Int parameters and Int return type.
fun sum(a: Int, b: Int): Int {
    return a + b
}

// A function body can be an expression. Its return type is inferred.
fun sum2(a: Int, b: Int) = a + b

// A function that returns no meaningful value.
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}