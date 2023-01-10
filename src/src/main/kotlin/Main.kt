fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    // https://www.codecademy.com/courses/learn-kotlin/lessons/kotlin-data-types-variables/exercises/introduction
    mutableVariables();
    immutableVariables();
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