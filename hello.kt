fun printHello(name:String?, action:() -> Unit) {
   if(name !== null) {
      println("Hello $name")
   } else {
      println("Hi there")
   }
   action()
}


fun main(){ 
   printHello("Kodee"){}
}

