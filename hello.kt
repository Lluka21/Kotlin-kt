package org.example

import kotlin.math.absoluteValue

fun main() {
    val str:String = "ABC"
}

fun generatePermutation(str: String)  {

    val charArray = str.toCharArray()
    var temporary = charArray[0] // A
    charArray[0] = charArray[1] // B
    charArray[1] = temporary // A
//    var secondTemporary = charArray[1]
//    temporary = secondTemporary
//    val swapResult = charArray.swap()
//    Hint 2: Stop recursion when the current index reaches the end of the string.
//    Hint 3: Swap each character with the current index to explore all possibilities.
//    Hint 4: Use backtracking to revert swaps after each recursive call.
//    Hint 5: Store and return all generated permutations in a list.


}
