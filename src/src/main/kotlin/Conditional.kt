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
}