class Collections {

    fun immutableLists() {
        // Write your code below 🏊‍♀️
        var waterSports = listOf("Wind Surfing", "Sailing", "Swimming", "Jet Skiing", "Water Skiing")

        println(waterSports)
    }

    fun accessingItemsInList() {
        // Write your code below 🏃‍♀️
        var unitedStatesMarathons =
            listOf("Boston Marathon", "Bank of America Chicago Marathon", "TCS NYC Marathon", "Marine Corps Marathon")

        println(unitedStatesMarathons[1])
    }

    fun mutableLists() {
        // Write your code below 🎭
        var openBroadwayShows = mutableListOf("The Lion King", "Chicago", "The Cher Show", "Les Miserables")

        openBroadwayShows[2] = "Wicked"

        println(openBroadwayShows)
    }

    fun sizeOfLists() {
        // Write your code below 🍎

        var fruitTrees = mutableListOf("Apple", "Plum", "Pear", "Cherry")

        println("I am growing ${fruitTrees.size} different types of fruit in my garden.")
    }

    fun removingAndAddingToAList() {
        val planets = mutableListOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")

        // Can remove an element based on name 🪐
        planets.remove("Pluto")
        println(planets)
        planets.add("Earf")
        println(planets)
        println(planets.random())

    }
}