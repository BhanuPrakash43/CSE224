data class OrderItem(
    val name: String,
    val price: Double
)

class TaxCalculator{
    companion object{
        val salesTaxPercentage=15.0

        fun getTaxAmountForOrderItems(orderItems:List<OrderItem>):Double{
            var orderAmount=0.00

            for(orderItem in orderItems){
                orderAmount+=orderItem.price

            }
            return orderAmount*salesTaxPercentage/100.0

        }
    }
}

fun main(){
    val orderItemList=listOf(
        OrderItem("Burger", 8.0),
        OrderItem("Pizza",24.99),
        OrderItem("Fries",3.76)
    )

    val taxAmount=TaxCalculator.getTaxAmountForOrderItems(orderItemList)
    println(taxAmount)
    
}