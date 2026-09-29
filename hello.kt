fun main() {
    numberChecker(10)
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
