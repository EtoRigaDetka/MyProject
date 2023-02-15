class Playeer(val firsName: String, var secondName: String) {
    var totalScore = 0.0
    var personalBestScore = 0.0
    fun fullName(): String {
        return firsName + " " + secondName
    }
}

class Scores() {
    fun checkBest(best: Double, current: Double): Double {
        if (best < current) {
            return current
        } else return best
    }
}

fun main() {
    val p1 = Playeer("Georgijs", "Lepetjans")
    val p2 = Playeer("Boris", "Dzonsons")
    var lvlScore = 0.0
    val scoring = Scores()
    println(p1.fullName())


// Level 1 p1 Win
    lvlScore = 12.0
    p1.totalScore += lvlScore
    p1.personalBestScore = scoring.checkBest(p1.personalBestScore, lvlScore)
    println("The winner is ${p1.fullName()} with score $lvlScore")
    println("The Personal Best is ${p1.personalBestScore}")
    println("The Total score is ${p1.totalScore}")

// Level 2 p1 Win
    lvlScore = 25.0
    p1.totalScore += lvlScore
    p1.personalBestScore = scoring.checkBest(p1.personalBestScore, lvlScore)
    println("The winner is ${p1.fullName()} with score $lvlScore")
    println("The Personal Best is ${p1.personalBestScore}")
    println("The Total score is ${p1.totalScore}")

// Level 2 p1 Win
    lvlScore = 5.0
    p1.totalScore += lvlScore
    p1.personalBestScore = scoring.checkBest(p1.personalBestScore, lvlScore)
    println("The winner is ${p1.fullName()} with score $lvlScore")
    println("The Personal Best is ${p1.personalBestScore}")
    println("The Total score is ${p1.totalScore}")

//Final Result

    if (p1.totalScore > p2.totalScore) {
        println("The Winner is $p1")
        println("The Personal Best is ${p1.personalBestScore}")
        println("The Total score is ${p1.totalScore}")
    } else {
        println("The Winner is $p2")
        println("The Personal Best is ${p2.personalBestScore}")
        println("The Total score is ${p2.totalScore}")
    }
}