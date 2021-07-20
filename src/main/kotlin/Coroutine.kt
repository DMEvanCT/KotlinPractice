//import kotlinx.coroutines.*
//
//
//fun NumbersLow() {
//    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
//    numbers.forEach{
//        print("${it}\n")
//    }
//}
//
//fun NumbersHigh() {
//    val numbers = listOf<Int>(12312312,232132312,43553453,564565645)
//    numbers.forEach{
//        print("${it}\n")
//    }
//}
//
//fun Manynames() {
//    val names = listOf<String>("Evan", "John", "Steve")
//    names.forEach{
//        print("${it}\n")
//    }
//}
//
//fun ManyCities() {
//    val cities = listOf<String>("New London", "Hartford", "New Haven")
//    cities.forEach{
//        print("${it}\n")
//    }
//}
//
//
//
//fun main() {
//    runBlocking {
//        launch { NumbersLow() }
//        NumbersHigh()
//    }
//    GlobalScope.launch {
//        Manynames()
//
//    }
//    ManyCities()
//
//
//}