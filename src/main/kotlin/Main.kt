fun main() {
    // filterとは、条件に合致する要素だけを取り出す関数
    val items: List<String> = listOf("apple", "banana", "kiwifruit")
    // appleという要素だけ条件式を使って取り出す
    items.filter { it == "apple" }.forEach { println(it) }
    // Listから、要素の長さが5以上のものだけを取り出す
    items.filter { it.length >= 5 }.forEach { println(it) }
}