package games

import wordSource.WordProcessor

// HOW THIS GAME WORKS
// select randomWord from list
// scramble the word
// receive a guessedWord
// compare guessedWord with the randomWord
// if correct, congratulate and exit program
// if incorrect show randomWord and exit program

class UnscrambleGame(val wordProcessor: WordProcessor) {

    val wordList = wordProcessor.findFiveLetterWords()

    var randomWord: String = ""
    var scrambledRandomWord: String = ""

    fun generateAndScramble(): String {
        selectRandomWord()
        scramble()
        return scrambledRandomWord
    }

    fun selectRandomWord(): String {

        val randomIndex: Int = (0..(wordList.size - 1)).shuffled().first()
        randomWord = wordList[randomIndex]
        return randomWord
    }

    fun scramble(): String {
        scrambledRandomWord = randomWord.split("").shuffled().joinToString("")
        if (scrambledRandomWord == randomWord) {
           scramble()
        }
        return scrambledRandomWord
    }

    fun checkSolutionCorrect(solution: String): Boolean {
        return solution == randomWord
    }
}
