package nullsafty

fun main(){
    val gender : String = "Male" // "Female" , "Other"
    val gender2 : String? = null // accept null value
    val isAdult : Boolean? = null

    if(gender2 != null){
        gender2.toUpperCase()
    }

    // safe call operator ?
    // it will check if fun is null ot not
    // if it is null than it will not call function
    println(gender2?.toUpperCase())


    // in case of user multiple statements
    gender2?.let {
        println("line 1")
        println("line 2 $gender2")
        println("line 3 $it")   // it point to obj in the scope. it point gender2
    }

    // we cal call let for nullable and non nullable both
    gender.let {
        println("$it")
    }


    // compiler predict nullable value and call safe operator by default
    // elvis operator ?:
    val selectedValue = gender2 ?: "NA"
    println(selectedValue)

    // if null than throw error otherwose call function
    //assert operator
    val value = gender2!!.toUpperCase()
    println(value)

}