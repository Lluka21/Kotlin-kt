fun main() {
    val heightAlice = 160
    val heightBob = 175

    val taller = if(heightAlice > heightBob) {
      println("Choose Alice\n")
      heightAlice
    } else {
      println("Choose Bob\n")
      heightBob
   }

   println("Taller height is $taller")
   
}