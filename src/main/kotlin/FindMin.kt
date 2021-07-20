/*
data class Grocery(val Name: String, val category: String, val unit: String, val unitprice: Double, val quantity: Int)

*/
/*fun getTotalCost(gc: List<Grocery>): Double {
    var totalCost = 0.0
    for (g in gc) {
        totalCost += (g.unitprice * g.quantity)
    }
    return totalCost

}*//*


// The above gets transformed into. More concise
//val totalcost = groceries.sumByDouble { it.quantity * it.unitprice }

fun main() {
    val groceries = listOf<Grocery>(Grocery("Tomatoes", "Vegetables", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetables", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive Oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice Cream", "Frozen", "Pack", 3.0, 2))

    val highestunitprice = groceries.maxByOrNull { it.unitprice }
    val higestQuanity = groceries.maxByOrNull { it.quantity }
    val totalcost = groceries.sumByDouble { it.quantity * it.unitprice }
    val nameswithfold = groceries.fold(" ") { string, item -> string + " ${item.Name}"}
    val groceryname = groceries.map { it.Name }
    val pricesabovethree = groceries.filter { it.unitprice > 3.0 }
    val taxedabove3 = groceries.filter { it.unitprice > 3 }.map { it.unitprice * 1.065 }
    val ints = listOf(1, 2, 3, 4, 5, 6 )
    val sumofInts = ints.fold(0) {runningSum, item -> runningSum + item}
    val changefrom50 = groceries.fold(50.0) { change, item -> change - (item.unitprice * item.quantity)}
    var itemNames = ""
    //val nameofitemsover4 = groceries.filter { it.unitprice > 3 }.forEach{ itemNames += it.Name}
    val groupbyCatagory = groceries.groupBy { it.category }.forEach{ println(
        it.key)
        it.value.forEach{ println("   ${it.Name}")}
    }


    if (higestQuanity != null) {
        println(higestQuanity.Name)
    }
    if (highestunitprice != null) {
        println(highestunitprice.Name)
    }
    println("The total cost of your groceries are: $totalcost")
    println("The vegetables in your groceries are ${groceries.filter { it.category == "Vegetables" }}")
    for (gro in groceryname) {
        println(gro)
    }
    println("Here is the items with a unit price above 3: ${pricesabovethree}")
    println("Printing taxed above 3: ${taxedabove3}")
    //println("The name of the above 3 are ${nameofitemsover4}")
    println("Group by catagory: ${groceries}")
    println("The sum of the ints are ${sumofInts}")
    println("The folded names: ${nameswithfold}")
    println("Change from '$50.0': ${changefrom50}")

}


*/
