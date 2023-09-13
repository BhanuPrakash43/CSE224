fun main() {
    val unsortedArray = arrayOf("banana", "apple", "grape", "orange", "kiwi")

    
    val sortedArray = unsortedArray.sorted()

   
    println("Sorted array:")
    for (element in sortedArray) {
        print(""+element+" ")
    }
}
