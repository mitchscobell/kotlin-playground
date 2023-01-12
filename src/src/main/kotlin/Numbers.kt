class Numbers {
    fun meals() {

        // Appetizer
        val caesarSalad = 8.50

        //  Entree
        val beefStroganoff = 18

        // Dessert
        val cheesecake = 6

        // Add your code below ⬇️
        var tip = 0.15
        var total = caesarSalad + beefStroganoff + cheesecake

        var finalAmount = total * tip + total

        print("Your final amount is: ")
        println(finalAmount)
    }

    fun numberFacts() {
        var speedOfLight = 186_000
        // Write your code here
        speedOfLight += 282

        var perfectSquare = 32
        // Write your code here
        perfectSquare *= 2

        var sheldonsFavoriteNum = 219
        // Write your code here
        sheldonsFavoriteNum /= 3

        var emergency = 920
        // Write your code here
        emergency -= 9

        var firstCountingNum = 10
        // Write your code here
        firstCountingNum %= 5


        println("The speed of light is ${speedOfLight}.")
        println("A perfect square is ${perfectSquare}.")
        println("Sheldon's favorite number is ${sheldonsFavoriteNum}.")
        println("The emergency number in the United States is ${emergency}.")
        println("The first counting number in programming is ${firstCountingNum}.")
    }

    fun mathFunctions() {

        var ceil = Math.ceil(3.5)
        println(ceil)
        // Add your notes below
        println("ceil goes to the next whole number")

        var sqrt = Math.sqrt(25.0)
        println(sqrt)
        // Add your notes below
        println("sqrt does the square root")

        var abs = Math.abs(-20)
        println(abs)
        // Add your notes below
        println("abs does absolute value")

        var floor = Math.floor(6.9)
        println(floor)
        // Add your notes below
        println("floor rounds down to the next whole number")

    }
}