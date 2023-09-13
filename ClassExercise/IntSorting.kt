fun main() {
    val unsortedArray = arrayOf(9, 4, 7, 1, 5, 2, 8, 3, 6)

    
    val sortedArray = unsortedArray.sorted()

    println("Sorted array:")
    for (element in sortedArray) {
        print( ""+element +" ")

    }
}