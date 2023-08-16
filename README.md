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
**リストに型を指定する**
```kotlin
fun main() {
    val items: List<String> = listOf("apple", "banana", "kiwifruit")
    println(items)
    val numbers: List<Int> = listOf(1, 2, 3)
    println(numbers)
}
```

**filterメソッド**
要素から、条件に合うものだけを抽出したい場合は、filterメソッドを使う。
````kotlin
fun main() {
    // filterとは、条件に合致する要素だけを取り出す関数
    val items: List<String> = listOf("apple", "banana", "kiwifruit")
    // appleという要素だけ条件式を使って取り出す
    items.filter { it == "apple" }.forEach { println(it) }
    // Listから、要素の長さが5以上のものだけを取り出す
    items.filter { it.length >= 5 }.forEach { println(it) }
}
````


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

## 繰り返し処理
**for文**
```kotlin
fun main(args: Array<String>) {
    // for文を使って1から10までの数字を表示する
    for (i in 1..10) {
        println(i)
    }
}
```
**while文**
```kotlin
fun main(args: Array<String>) {
    // while文を使って1から10までの数字を表示する
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }
}
```

## 関数
````kotlin
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
````

## クラス
```kotlin
// このクラスは、Personクラスのインスタンスを生成し、greetメソッドを呼び出すだけのクラスです。
class Person(val name: String, val age: Int) {
    fun greet() {
        println("私の名前は${name}です。年齢は${age}です。")
    }
}

fun main() {
    val person = Person("田中太郎", 20)
    person.greet()
}
````