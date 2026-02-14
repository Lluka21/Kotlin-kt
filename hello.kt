
fun <T> asList(vararg ts: T): List<T>{
   val result = ArrayList<T>()
   for(t in ts) {
      result.add(t)

fun main() {
   val fruits = listOf("Apple","Banana","Cherry")

   for((index,fruit) in fruits.withIndex()) {
      println("$index: $ruit")

   }
   return result
}
