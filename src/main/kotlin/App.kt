import javax.net.ssl.HostnameVerifier

// open allows class to be superclass
// final means you can't override the superclass function
// override allows you to override the superclass function
// abstract on the superclass only allows calling of subclass
// concrete is the reverse of abstract
/*fun main(args: Array<String>) {
    val regions = listOf<String>("us-east-1", "us-east-2", "us-west-1", "us-east-1")
    val rg = region_selection(regions)
    // Prevents Duplicates. We should actually do a mutiple set from the start
    // Totally unnecessary compute
    val convertedrg = rg.toSet()
    println(convertedrg)

    var h1 = Hippo()
    var h2 = Hippo()
    var h3 = Hippo()


}*/

interface MutatableList<Hippo>: List<Hippo>, MutableCollection<Hippo> {
    fun add(index: Int, element: Hippo): Unit
}
/*class CreateHippos<T: Hippo>: MutableMap<T, String> {
    private val hipponames: MutableMap<T, String> = mutableMapOf()

    fun GetName(t: T, name: String = "Jason".toUpperCase()): MutableMap<T, String> {
        if (name != "Jason".toUpperCase()) {
            hipponames.putIfAbsent(t, name)
        } else {
            print("Jason is not a good name for a pet".toUpperCase())
        }
        return hipponames
    }
}*/




//}


// Use open if you want to use this class in inheritence use abstract to use in inheritance but noit be able to call directly
abstract class Animal() {
    open val image: String? = null
    open val food: String? = null
    open val habitat: String? = null
    var hunger = 10

    open fun makeNoise() {
        println("This animal is making noise ")

    }

    open fun eat() {
        println("This animal is eating")
    }

    open fun roam() {
        println("This animal is roaming")
    }

    fun sleep() {
        println("This animal is sleeping")
    }
}


class Hippo: Animal() {
    override val image = "hippo.jpg"
    override val food: String? = null
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt Grunt")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }
}

fun region_selection(rg: List<String>): List<String> {
    var regions = mutableListOf<String>()
    regions.addAll(rg)
    var regions_to_list = regions.toList()
    if (regions_to_list.contains("us-east-1")) {
        println("NOTICE: US-EAST-1 is kind of dangerous")
    }
    return regions_to_list
}






/*fun main(args: Array<String>) {
    var dogs = arrayOf(Dog("Stone", 110, "Chocolate Lab"), Dog("Chip", 40, "Pitbull Black Lab"),
        Dog("Yogi", 125, "Yellow Lab"))

    var dg = Dog("Spot", weight = -1, breed = "Chocolate Lab")
    dg.getWeight()

    for (dog in dogs) {
        println(dog.name)
        println(dog.breed)
        println(dog.weight)
    }
}


class Dog(val name: String, var weight: Int, val breed: String) {
    init {
        println("Your dog $name was created!")
    }

    var wt = weight
        set(value) {
            if (value > 0) field = value
        }

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }

    fun getWeight() {
        println("The weight of $name is $wt")
    }
}*/

/*fun main (args: Array<String>) {
    //whatsmyname()
    val options = arrayOf("Rock", "Paper", "Scissors")
    val userChoise = getUserChoise(options)
    val gameChoice = getGameChoise(options)
    val game = playRockPaper(userChoise, gameChoice)
    println(game)




}


fun whatsmyname() {
    var x = 0
    val name = "Evan"
    val name2 = "Jordan"
    while (x < 100) {
        print("My name is $name\n")
        x += 1
    }

    var myArray = arrayOf(1,2,3)
    println(myArray.size)

    for (i in 1..10) {
        println("My name is $name2")
    }

    if (name2.equals("Jordan")) {
        println("I was equal to $name2")
    }
    else {
        println("I was equal to $name2 not Jordan")
    }


}

fun wordgame() {
    val wordArray1 = arrayOf("24/7", "Multi Tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size


    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()


    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]}, ${wordArray3[rand3]}"
    println(phrase)
}

fun getGameChoise(options: Array<String>): String   {
    val optionparm =  options[(Math.random() * options.size).toInt()]
    return optionparm
}

fun getUserChoise(options: Array<String>): String {
    var isValidChoice = false
    var userChoise = ""
    while (!isValidChoice) {
        print("Please enter one of the following:")
        for (item in options) print(" $item")
        println(".")
        val userInput = readLine()
        if (userInput != null && userInput in options) {
            isValidChoice = true
            userChoise = userInput
        }
        if (!isValidChoice) println("Please enter a valid choice")
        }
    return userChoise
    }

fun playRockPaper(userChoice: String, gameChoice: String): String {
    val result: String
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
            userChoice == "Paper" && gameChoice == "Rock" ||
            userChoice == "Scissors" && gameChoice == "Paper") result = "Win! Computer chose $gameChoice"
    else result = "LOSE!"
    return result
}


fun getIndex(options: Array<String>) {
    for ((index, item) in options.withIndex()) {
        println("The $item is at $index")
    }
}

fun playGame() {

}

fun mathcalc(a: Int, b: Int): Int = if (a > b) a else b*/

