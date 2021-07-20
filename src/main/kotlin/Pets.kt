/*
abstract class Pet(var name: String)

// This one is more generic and allows vet to be used in any animal withoug assigning specific
class Vet<in T: Pet> {
    fun treat(t: T) {
        println("Treat pet ${t.name}")
    }
}
// This one is more specific and makes you configure the cat vs dog ve
*/
/*class Vet<T: Pet> {
    fun treat(t: T) {
        println("Treat pet ${t.name}")
    }
}*//*

class Cat(name: String): Pet(name)
class Dog(name: String): Pet(name)
class Fish(name: String): Pet(name)

class Contest<T: Pet>(var vet: Vet<T>) {
    val scores: MutableMap<T, Int> = mutableMapOf()
    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
    }

    fun getWinner():  MutableSet<T> {
        val winners: MutableSet<T> = mutableSetOf()
        val highScore = scores.values.max()
        for ((t, score) in scores) {
            if (score == highScore) winners.add(t)
        }
        return winners
    }
}

// Create lambda function after this instantiates
fun convert(x: Double, converter: (Double) -> Double): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}





fun main(args: Array<String>) {
    // Lambda functions
    var addfive = {x: Int -> x + 5}
    val addThree: (Int) -> Int = {x -> x + 3}
    var areasquare = {x: Int, y: Int -> x * y}
    val sringexample: () -> String
    val addthreetome = addThree.invoke(3)
    sringexample = { "Hello!" }
    println("The output of the sting example is  $sringexample")
    val result = addfive.invoke(5)
    val areaofsquare = areasquare.invoke(10, 5)
    println("The result of the addfive lambda is $result")
    println("The result of the aread square lambda is ${areaofsquare}")
    println("The result of add three lambda is $addthreetome")
    val petVet = Vet<Pet>()
    // Cat vets can treat cats
    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val dogVet = Vet<Dog>()
    val catFuzz = Cat(name = "Fuzz Lightyear")
    val catKazu = Cat(name = "Katsue")
    val dogman = Cat(name = "Super Dog")
    val fishman = Fish(name = "Charles Xavior")
    catVet.treat(catFuzz)

    val catContest = Contest<Cat>(Vet<Pet>())
    catContest.addScore(catFuzz, 52)
    catContest.addScore(catKazu, 53)
    val topCat = catContest.getWinner().first()
    println("The top cat is ${topCat.name}")

    val petContest = Contest<Pet>(Vet<Pet>())
    petContest.addScore(fishman, 24)
    petContest.addScore(dogman, 100)
    petContest.addScore(catKazu, 50)
    val petContestWinner = petContest.getWinner().first()
    println("The winner of the pet contest is ${petContestWinner.name}")


    convert(20.00) { c: Double -> c * 1.8 + 32 }

}
*/
