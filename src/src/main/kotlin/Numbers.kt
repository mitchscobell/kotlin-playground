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
}