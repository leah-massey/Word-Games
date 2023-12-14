class UnscrambleGame {

    // select randomWord from list
    // scramble the word
    // receive a guessedWord
    // compare guessedWord with the randomWord
    // if correct, congratulate and exit program
    // if incorrect show randomWord and exit program

    var randomWord: String? = null

    fun selectRandomWord(wordList: List<String> = listOf("pound", "trice", "hired", "comma", "logic")): String {
        val randomIndex: Int = (0 .. (wordList.size -1)).shuffled().first()
        randomWord = wordList[randomIndex]
        println(randomWord)
        return wordList[randomIndex]
    }



}