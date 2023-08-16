# KotlinTutorial

**日本語の情報**
https://minegishirei.hatenablog.com/entry/2023/02/09/101751


**Kotlinの公式リファレンスのリンク**

https://kotlinlang.org/docs/kotlin-tour-welcome.html

こちらのサイトを参考に学習を進めて行きます。

**挨拶を返すだけのプログラム**
```kotlin
fun main(args: Array<String>) {
    val name: String = "Kotlin"
    println("Hello, $name!")
}
```

## データの型
Kotlinには以下の基本型がある：

https://kotlinlang.org/docs/kotlin-tour-basic-types.html

**使用例**
## 変数
```kotlin
fun main(args: Array<String>) {
    val name: String = "Kotlin"// String型はダブルクォーテーションで囲む
    val age: Int = 4// Int型は整数
    val width: Double = 1.0// Double型は小数
    val done: Boolean = true// Boolean型はtrueかfalse
    val characters: Char = 'a'// Char型はシングルクォーテーションで囲む
    println(name)
    println(age)
    println(width)
    println(done)
    println(characters)
}
```

## List
https://kotlinlang.org/docs/kotlin-tour-collections.html
```kotlin
fun main(args: Array<String>) {
    // フルーツというListを作成
    val fruits = listOf("apple", "banana", "orange")
    // フルーツの要素を1つずつ取り出して表示
    for (fruit in fruits) {
        println(fruit)
    }
    // Listの中身を全て表示
    print(fruits)
}
```
## Set
Listは重複した要素を持つことができるが、Setは重複した要素を持つことができない。
```kotlin
fun main(args: Array<String>) {
// Setを使って、重複を許さないリスト果物のリストを作る。Setは同じ値を複数持てない。
    val fruits = setOf("apple", "banana", "orange", "apple")
    println(fruits)
}
```

## Map
Mapはキーと値のペアを保持するコレクションである。
```kotlin
fun main(args: Array<String>) {
// Mapを使用して果物の名前と値段を格納する
    val fruits = mapOf("apple" to 100, "banana" to 200, "orange" to 300)
// Mapの要素を順番に処理する
    fruits.forEach { key, value ->
        println("$key is $value yen.")
    }
    println(fruits)
}
```

## 条件分岐
**if文**
```kotlin
ifを使い500円以上なら、ワンコインランチが食べれて、¥500未満だったら変えない条件分岐
```kotlin
fun main(args: Array<String>) {
    val money = 400
    if (money >= 500) {
        println("ワンコインランチが食べれる")
    } else {
        println("ワンコインランチが食べれない")
    }
}
```
**when文**
```kotlin
fun main(args: Array<String>) {
   // 複数の分岐を持つ条件式がある場合は、whenを使う。
   val obj = "ぶどう"
    when (obj) {
         "りんご" -> println("りんごです")
         "みかん" -> println("みかんです")
         "ぶどう" -> println("ぶどうです")
         else -> println("その他です")
   }
}
```
