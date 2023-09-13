
fun factorial(n:Int):Int{
    if(n==0||n==1){
        return 1
    }
    else{
        return n*factorial(n-1)
    }
}


fun main() {
    println("Enter the number: ")
    var num=readLine()?.toIntOrNull()
    if(num==null || num<0){
        println("Invalid Input")
        return
    }
    val result:Int=factorial(num)
    println("Factorial of $num is :$result")
}