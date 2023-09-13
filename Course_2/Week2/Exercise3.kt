@Test   fun applyDiscount_moreThanFive_discountNotApplied() {       
     val product = Product("Steak", 30.00, 8)        
      product.applyDiscount(20)         
      assertEquals(30.00, product.price, 0.0)  
     }   

     
     @Test   fun applyDiscount_outOfStock_discountNotApplied() {        
        val product = Product("Lasagna", 10.00, 0)         
        product.applyDiscount(20)  

        assertEquals(10.00, product.price, 0.0)   
    }
    
    data class Product(    val title: String,    var price: Double,    var amount: Int) 
    {     
        fun applyDiscount(discountPercent: Int) {        
            if (amount > 0 && amount <= 5){   

                 price -= (price * discountPercent / 100)   
                }        
            }         
        }