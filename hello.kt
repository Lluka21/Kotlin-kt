fun main() {
    numberChecker(10)

    val given_number = 10

    if(given_number % 7 == 0) {
        println("$given_number is divisible by 7")
    } else {
        println("$given_number is not divisible by 7")
    }
}

fun numberChecker(given_number: Int): String {
    if(given_number > 0) {
         println("Positive Number")
    } else if(given_number < 0) {
        println("Negative Number")
    } else if(given_number == 0) {
        println("Zero ")
    }  
    return given_number.toString()
}
