package games
import wordSource.WordProcessor
class UnscrambleGame(val wordProcessor: WordProcessor) {

    var wordList = wordProcessor.findFiveLetterWords()
    var randomWord: String = ""
    var scrambledRandomWord: String = ""

    fun generateAndScramble(): String {
        selectRandomWord()
        scramble()
        return scrambledRandomWord
    }

    fun selectRandomWord(): String {
        randomWord = wordList.shuffled()[0]
         wordList = wordList.filter {
             it != randomWord
         }
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
