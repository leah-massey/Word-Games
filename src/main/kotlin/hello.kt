import games.UnscrambleGame

fun main() {
    val unscrambleGame = UnscrambleGame()
    println("Welcome to Word Games!")
    println("Unscramble this word: ${unscrambleGame.generateAndScramble()}")
    val solution = readLine()!!
    println(unscrambleGame.checkSolution(solution))
}