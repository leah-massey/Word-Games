fun main() {
    val unscrambleGame = UnscrambleGame()
    unscrambleGame.selectRandomWord()
    println("Unscramble this word: ${unscrambleGame.scramble()}")
    val solution = readLine()!!
    println(unscrambleGame.testSolution(solution))
}