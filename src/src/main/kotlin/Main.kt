fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    // https://www.codecademy.com/courses/learn-kotlin/lessons/kotlin-data-types-variables/exercises/introduction
    mutableVariables();
    immutableVariables();
    typeInterfaces();
    favoriteSong();
}

fun mutableVariables() {
    var someDate: String = "01/10/2023";
    println(someDate);
}

fun immutableVariables() {
    // val is used like const
    val pi: Double = 3.14
    println(pi);
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