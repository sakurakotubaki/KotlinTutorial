// 通常の関数
fun hello() {
    println("Hello, world!")
}

// 足し算する関数
fun sum(a: Int, b: Int): Int {
    return a + b
}

// ラムダ式で足し算する関数
val sum2 = { a: Int, b: Int -> a + b }

fun main() {
    hello()
    println("関数で実行-------------")
    println(sum(1, 2))
    println("ラムダ式で実行-------------")
    println(sum2(1, 2))
}