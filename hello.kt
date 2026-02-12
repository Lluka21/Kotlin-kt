fun main() {
   val deliveryStatus = "OutForDelivery"
   when(deliveryStatus) {
      "Pending" -> print("Your order is being prepared")
      "Shipped" -> print("Your order is on the way")
      else -> print("Check your mini-map")
   } 
   
    
}