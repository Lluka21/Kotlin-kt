fun main() {
    val simpleArray = arrayOf(1,2,3)
    val twoDArray = Array(2) { Array<Int>(2) {0} }

    simpleArray[0] = 10
    twoDArray[0][0] = 2

    println(simpleArray.joinToString())
    println(twoDArray[0][0].toString())

}   

