fun main() {
    numberChecker(10)

    val given_number = 10

    if(given_number % 7 == 0) {
        println("$given_number is divisible by 7")
    } else {
        println("$given_number is not divisible by 7")
    }

     val vowels: CharArray = charArrayOf('a', 'e', 'i', 'o', 'u')
    val consonants: CharArray = charArrayOf(
        'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
        'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'
    )


    val given_character: Char = 'a'

    if(given_character in vowels) {
        println("this '$given_character' is vowel")
    } else if(given_character in consonants) {
        println("this '$given_character' is consonant")
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
