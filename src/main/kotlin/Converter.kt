
typealias DoubleConversion = (Double) -> Double

fun getConversionLambda(str: String): DoubleConversion {
    when (str) {
        "CentigradeToFahrenheit" -> {
            return { it * 1.8 + 32 }
        }
        "KgsToPounds" -> {
            return { it * 2.204623 }
        }
        "PoundsToUSTons" -> {
            return  { it / 2000 }
        }
        else -> {
            return  { it }
        }
    }
}

fun combine(lambda1: DoubleConversion, lambda2: DoubleConversion): DoubleConversion {
    return {x: Double -> lambda2(lambda1(x))}
}


/*
fun main() {
    val value = 180.00
    // invokes the method and the lambda
    val tons = getConversionLambda("PoundsToUSTons")(value)
    print(tons)
}*/
