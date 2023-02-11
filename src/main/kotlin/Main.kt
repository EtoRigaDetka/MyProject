fun main() {
//        *
//       **
//      ***
//     ****
//    *****
    var stars = ""
    for (i in 1..5) {
        for (j in 5 downTo i) {
            print(" ")
        }
        stars=stars+"*"
        print(stars)
        println()
    }
}
