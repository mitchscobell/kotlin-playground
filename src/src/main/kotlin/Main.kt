fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications:
    // https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    // https://www.codecademy.com/courses/learn-kotlin/lessons/kotlin-data-types-variables/exercises/introduction
    mutableVariables()
    immutableVariables()
    typeInterfaces()
    favoriteSong()
    readingInSomeStuff()
    compilingByHand()
    wordCapitalizationAndSize()
}

fun mutableVariables() {
    var someDate: String = "01/10/2023"
    println(someDate)
}

fun immutableVariables() {
    // val is used like const
    val pi: Double = 3.14
    println(pi)
}

fun typeInterfaces() {
    var typeTest = "6"

    // Declare your variable above ⬆️
    print("${typeTest::class.simpleName}")
}

fun favoriteSong() {
    // Write your code below
    var favoriteSong: String = "Two Weeks"
    var songDuration: Int = 4
    var currentlyListening: Boolean = false
    println("My Favorite Song is ${favoriteSong}")
    println("My Favorite Song is about ${songDuration} minutes long")
    println("Am I currently listening? ${currentlyListening}")
}

fun stringsAndStuff() {
    // Strings

    val landmark = "Statue of Liberty 🗽"
    val city = "New York"
    val country = "USA"

    // Characters

    var letter = 'A'
    var digit = '1'
    var symbol = '*'

    // Fun fact

    /* A single emoji is made up of Unicode characters.
    Thus, it will be interpreted as a String
    and must always be wrapped in double quotes:  */

    var emoji = "🤓"
}

fun readingInSomeStuff() {
    println("What is your name?")
    var myName = readLine()
    println("Your name is $myName!")
}

fun compilingByHand() {
    println("*************************************************")
    println("\nIf you want to compile by hand run this command:")
    println("kotlinc myCode.kt -include-runtime -d myCode.jar")
    println("\nYou can run it then manually by running this command:")
    println("java -jar myCode.jar")
    println("*************************************************")
}

fun wordCapitalizationAndSize() {
    var word = "supercalifragilisticexpialidocious"

    // Write your code below ☂️

    word = word.capitalize()
    var wordSize = word.length

    println("$word has $wordSize letters.")
}

