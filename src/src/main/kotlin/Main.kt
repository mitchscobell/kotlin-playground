fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications:
    // https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    // https://www.codecademy.com/courses/learn-kotlin/lessons/kotlin-data-types-variables/exercises/introduction

    val variables = Variables()
    variables.mutableVariables()
    variables.immutableVariables()
    variables.typeInterfaces()
    variables.favoriteSong()
    variables.readingInSomeStuff()
    variables.compilingByHand()
    variables.wordCapitalizationAndSize()

    val numbers = Numbers()
    numbers.meals()
    numbers.numberFacts()
    numbers.mathFunctions()

    val conditional = Conditional()
    conditional.learningSyntax()
    conditional.whenStatements()
    conditional.scovilleScale()

    val collections = Collections()
    collections.immutableLists();
}

