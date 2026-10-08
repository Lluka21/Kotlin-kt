fun main() {

    greeting("Luka")
    evenNumbers(intArrayOf(1, 2, 3, 4, 5))

}

fun greeting(name: String): String {
    println("Hello $name!")
    return ""
}

// IntArra
fun evenNumbers(
    arrayOfIntegers:IntArray = intArrayOf(),
){
    for(i in arrayOfIntegers) {
        if(i % 2 == 0) {
            println(i)
        }
    }
    
}
