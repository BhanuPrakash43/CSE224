data class SomeOrder(
    val orderId:Int,
    val month:String,
    val amount:Int
)

fun main() {
    val orderList=listOf(
        SomeOrder(1, "August", 40),
        SomeOrder(2,"September",35),
        SomeOrder(3,"September",35),
        SomeOrder(3,"October",67),
        SomeOrder(4,"November",89)
    )

    val aggregateSalesTaxForSeptember=orderList.filter { 
        order-> order.month=="September"
     }.map{
        order-> 9.5/100*order.amount
     }.fold(0.0){
        totalSalesTax, salesTaxForOrder-> totalSalesTax+salesTaxForOrder
     }

     println(aggregateSalesTaxForSeptember)

}