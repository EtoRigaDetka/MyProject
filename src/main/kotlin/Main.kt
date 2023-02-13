fun main() {

    fun printStars(num: Int) {
        for (j in 1..num) {
            print("*")
        }
        println()
    }

    fun triangle(height: Int) {
        for (i in 1..height) {
            printStars(i)
        }
    }

    triangle(5)
}