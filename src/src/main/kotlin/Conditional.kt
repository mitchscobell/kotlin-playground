class Conditional {
    fun learningSyntax() {
        val niceConst = 69

        if (niceConst == 69) {
            println("nice.")
        } else {
            println("not nice.")
        }

        var someVariable = if (niceConst == 69) 420 else 69
        println(someVariable)
    }

    fun whenStatements() {
        var season = "Fall"

        when (season) {
            "Winter" -> println("Grow kale.")
            "Spring" -> println("Grow lettuce.")
            "Summer" -> println("Grow corn.")
            "Fall" -> println("Grow pumpkins.")
            else -> println("Not a valid season.")
        }
    }

    fun scovilleScale() {
        var sHU = 17000
        var pungency: String

        // Write your code below
        if (sHU in 0..699) {
            pungency = "very mild"
        } else if (sHU in 700..2999) {
            pungency = "mild"
        } else if (sHU in 3000..24999) {
            pungency = "moderate"
        } else if (sHU in 25000..69999) {
            pungency = "high"
        } else {
            pungency = "very high"
        }

        println("A pepper with $sHU Scoville Heat Units has a $pungency pungency.")

    }
}