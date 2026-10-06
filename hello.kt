fun main() {
greeting("Luka")
}

fun greeting(name: String): String {
    println("Hello $name!")
    return ""
}

// IntArray 
fun evenNumbers(
    arrayOfIntegers:IntArray = intArrayOf(),
){
    for(i in arrayOfIntegers) {
        if(i % 2 == 0) {
            println(i)
        }
    }
    
}
