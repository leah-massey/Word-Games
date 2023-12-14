class UnscrambleGame {

    // select randomWord from list
    // scramble the word
    // receive a guessedWord
    // compare guessedWord with the randomWord
    // if correct, congratulate and exit program
    // if incorrect show randomWord and exit program

    var randomWord: String = "tests"

    fun selectRandomWord(wordList: List<String> = listOf("pound", "trice", "hired", "comma", "logic")): String {
        val randomIndex: Int = (0 .. (wordList.size -1)).shuffled().first()
        randomWord = wordList[randomIndex]
        return randomWord
    }

    fun scramble(): String {
        val randomOrder = (1..5).shuffled() // interesting - it's not the index but the position
        val scrambledWord: String = randomOrder.map {
             randomWord.split("")[it]
        }.joinToString("")

        return scrambledWord
    }

    fun testSolution(solution: String): String {
        return TODO()
    }



}