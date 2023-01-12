class Conditional {
    fun learningSyntax() {
        val niceConst = 69

        if(niceConst == 69) {
            println("nice.")
        } else {
            println("not nice.")
        }

        var someVariable = if (niceConst == 69) 420 else 69
        println(someVariable)
    }
}