import games.UnscrambleGame
import wordSource.WordProcessor

fun main() {
    val wordProcessor = WordProcessor()
    val unscrambleGame = UnscrambleGame(wordProcessor)
    println("Welcome to Word Games!")
    println("Unscramble this word: ${unscrambleGame.generateAndScramble()}")
    val solution = readLine()!!
    println(unscrambleGame.checkSolution(solution))
}