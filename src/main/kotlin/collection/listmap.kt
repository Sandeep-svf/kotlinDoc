package collection

fun main(){

    // LIST

    val num = listOf<Int>(1,2,3)
    println(num.indexOf(3))
    println(num.contains(1))    // true


    val num2 = mutableListOf<Int>(1,2,3)
    println(num2.indexOf(3))
    println(num2.contains(1))    // true
    println(num2)
    num2[1] = 4
    println(num2)
    num2.remove(1)
    println(num2)

    // merger one list to another list
    val list2 = listOf(11,12)
    num2.addAll(list2)
    println(num2)


    // MAP
    // key : Value pair
    val student = mutableMapOf<Int, String>()
    student.put(1,"Aarav Maurya")
    student.put(2,"Sam Maurya")
    student.put(3,"Pradeep Maurya")

    // Looping on MAP
    println(student.get(1))
    for((key,value ) in student){
        println("$key : $value")
    }

    student[8] = "jay shree ram"    // for add
    println(student[8])             // for get


    val map = mapOf<Int,String>(1 to "Hello",2 to "God")
    // using to operator for initialize it
    println(map)



}