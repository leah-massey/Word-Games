fun main() {
    val unscrambleGame = UnscrambleGame()
    println("Unscramble this word: ${unscrambleGame.generateAndScramble()}")
    val solution = readLine()!!
    println(unscrambleGame.testSolution(solution))
}