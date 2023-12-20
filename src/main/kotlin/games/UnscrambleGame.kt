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

        val randomIndex: Int = (0 .. (wordList.size -1)).shuffled().first()
        randomWord = wordList[randomIndex]
        return randomWord
    }

    fun scramble(): String {
        // create a random order to apply to the letters of randomWord
        var randomOrder: List<Int> = (1..5).shuffled() // interesting - it's not the index but the position when applied to a string
        // keep generating random order until it differs from original order
        while (randomOrder == (1..5).toList()) {
            randomOrder = (1..5).shuffled()
        }
        //apply random order to randomWord
        scrambledRandomWord = randomOrder.map {
            randomWord.split("")[it]

        }.joinToString("")


        return scrambledRandomWord
    }

    fun checkSolutionCorrect(solution: String): Boolean {
        return solution == randomWord
    }
}
