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