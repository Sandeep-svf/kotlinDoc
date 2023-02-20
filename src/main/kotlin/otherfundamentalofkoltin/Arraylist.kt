package otherfundamentalofkoltin

fun main(){
    // used to create dynamic arrays
    // read and write functionality
    // sequence of insertion order
    // non Synchronized and contain duplicate element

    // Constructor of Array list (used to create an empty arraylist) ->   Arraylist<E>()
    // used to create specified capacity  -> Arraylist(capacity : Int)
    // used to create Arraylist field with the element of collection -> Arraylist(element : Collection<E>)

    // Function of Arraylist ->
    // open fun add(element : E): Boolean (used to add specific function in to the collection)
    // open fun clear() -> used to remove all the element from the collection
    // open fun get (index : Int): E -> used to return the element at specific index in the list
    // open fun remove (element : E): Boolean -> used to remove single element of the specific element from
    // current collection, if it available


    val arrayList = ArrayList<String>()     // creating an empty arraylist
    arrayList.add("One")    // Adding an object in arraylist
    arrayList.add("Two")

    println("........ Printing an arraylist ..........")
    for ( i in arrayList){
        println(i)
    }

    // Arraylist using Collection
    val arrayList2: ArrayList<String> = ArrayList<String>(5)
    val list: MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")

    arrayList2.addAll(list)

    println("...... Printing arraylist2 .......")
    for(i in arrayList2){
        println(i)
    }

    // Find element in arraylist using collection
    val itr = arrayList2.iterator()

    println("...... printing arraylist2 usong collection.......")
    while (itr.hasNext()){  // As long as iterator have something means arrylist2 have something we will run while loop
        println(itr.next())
    }

    println("size of arrylist2 is:"+arrayList2.size)


    // Arraylist get()

    println("...... Printing arraylist2 using get() function.......")
    println(arrayList2.get(0))
    println(arrayList2.get(1))

}