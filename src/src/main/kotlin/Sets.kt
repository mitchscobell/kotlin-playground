class Sets {
    fun obsoleteTechSet() {
        // sets 💾
        var obsoleteTech = setOf("Rolodex", "Phonograph", "Videocassette recorder", "Video projector", "Rolodex")

        println(obsoleteTech)
    }

    fun elementsOfSets() {
        var islandsOfHawaii = setOf("Maui", "Lanai", "Oahu", "Kauai")

        println(islandsOfHawaii.elementAt(2))
        println(islandsOfHawaii.elementAtOrNull(6))
    }

    fun apolloLandingSites() {
        // 👩‍🚀
        var apolloLandingSites = mutableSetOf(
            "Mare Tranquillitatis",
            "Fra Mauro",
            "Hadley/Apennines",
            "Descartes",
            "Taurus-Littrow",
            "Oceanus Procellarum"
        )

        println("Apollo 🌕 Landing Sites")
        println(apolloLandingSites)
    }

    fun uniqueSets() {
        var uniqueParticipants = mutableSetOf<String>()
        var participants = listOf("elePHPant", "Gopher", "Lenny", "Moby Dock", "Codey", "Gopher")

        // Write your code below 🎤
        uniqueParticipants.addAll(participants)

        println("The talent show has ${uniqueParticipants.size} unique participants.")

        uniqueParticipants.clear()

        println(uniqueParticipants)
    }

    fun additionalSetFunctions() {
        // Write your code below 📝
        var testGrades = mutableSetOf(65, 50, 72, 80, 53, 84)

        var sum = testGrades.sum()

        var numStudents = testGrades.size

        var average = sum / numStudents

        if (average < 65) {
            println("Failed")
        } else {
            println("Passed")
        }
    }
}