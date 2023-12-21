import games.UnscrambleGame
import wordSource.WordProcessor

fun main() {
    var gamesPlayed: Int = 0
    val wordProcessor = WordProcessor()
    val unscrambleGame = UnscrambleGame(wordProcessor)
    println()
    println("Welcome to Word Games 👋🏻")
    println()
    println("First scrambled word: ${unscrambleGame.generateAndScramble()}")
    print("Type your unscrambled guess and press ⮐ : ")
    val userInput = readln()

    if (unscrambleGame.checkSolutionCorrect(userInput)) {
        println("Congrats, you got it! 🥳")
    } else {
        println("Nope! The correct answer was ${unscrambleGame.randomWord}.")
    }
    gamesPlayed ++
    println()

    if (gamesPlayed < 2) {
        println("Second scrambled word: ${unscrambleGame.generateAndScramble()}")
        print("Type your unscrambled guess and press ⮐ : ")
        val secondUserInput = readln()

        if (unscrambleGame.checkSolutionCorrect(secondUserInput)) {
            println("Congrats, you got it! 🥳")
        } else {
            println("Nope! The correct answer was ${unscrambleGame.randomWord}.")
        }
        println()
        println("This is the end of the game.")
    } else {
        println()
        println("This is the end of the game.")
    }

}

// 👇🏻 Code experiment, trying to identify arrow keys 👇🏻
//val userInput = System.console().readLine()
//if (userInput?.toByteArray()?.contentEquals(byteArrayOf(27, 91, 67)) == true) {
//    println("right arrow key pressed")
//} else if (userInput?.toByteArray()?.contentEquals(byteArrayOf(27, 91, 68)) == true) {
//    println("Left arrow key pressed")
//} else {
//    println("some other key pressed")
//}