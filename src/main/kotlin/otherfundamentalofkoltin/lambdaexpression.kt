package otherfundamentalofkoltin



    fun main () {
        // Is a function which has no name (but not same as anonymous function which also have no name)
        // Lambda expression and anonymous function are 'function literal'
        // i.e. Function that are not declared but passed immediately as an expression
        // Lambda is defined as curly braces {} which take variable as parameter (if any) and a body of a function
        // The body of a function is written after a variable (if any) followed by -> operator


        // Syntax:   {variable(s) -> body_of_lambda}


        // Normal function addition of two number
        addNumber(5,10)

        // writing same example with lambda expression
        val sum: (Int , Int) -> Int = {a:Int , b:Int -> a+b}
        println("Using lambda expression:"+sum(50,50))

        // we can do even shorter

        val sum2 = {a:Int, b:Int -> println(a+b)}
        sum2(50,500)



    }

    private fun addNumber(a: Int, b: Int) {
        val result = a+b
        println("result is:$result")
    }

