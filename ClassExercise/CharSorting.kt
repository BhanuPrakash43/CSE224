fun main() {
    val unsortedCharArray: CharArray = charArrayOf('z', 'a', 'c', 'b', 'f', 'e')

    
    val sortedCharArray = unsortedCharArray.sorted()

   
    println("Sorted array:")
    for (char in sortedCharArray) {
        print(""+char+" ")
    }
}
