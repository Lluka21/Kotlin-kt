fun read(b: Int, print:(Int) -> Unit = {println("No argument passed for 'print'")}) {
   print(b)

}

fun main(){ 
   read(1)
   read(2) { value -> 
         println("Value is $value")
   }

}

