fun main(args: Array<String>) {
// Mapを使用して果物の名前と値段を格納する
    val fruits = mapOf("apple" to 100, "banana" to 200, "orange" to 300)
// Mapの要素を順番に処理する
    fruits.forEach { key, value ->
        println("$key is $value yen.")
    }
    println(fruits)
}