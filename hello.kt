
import kotlin.math.absoluteValue

fun main() {
    val str: String = "ABC"
    generatePermutation(str)
}

fun generatePermutation(str: String) {
    // ჩემი აზრით base case ->
    // The recursion stops when the index reaches the last character of the string.

    var index:Int = 0
    if(index == str.length-1) {
        return
    }

    val charArray = str.toCharArray()
    var firstChar = charArray[0] // A

    charArray[0] = charArray[1] // B
    charArray[1] = firstChar // A


    println(charArray)


}

