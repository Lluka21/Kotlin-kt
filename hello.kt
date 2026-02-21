fun main() {
   var number = 1
   val lastNumber = 20
   var evenNumberCounter = 0

   while(number <= lastNumber) {
      number++

      if(isEvenNumber(number)) {
         continue
      }

      println(number)
   }

}

fun isEvenNumber(number: Int): Boolean {
   if((number % 2 ) == 0) {
      return true
   } else {
      return false
   }
}