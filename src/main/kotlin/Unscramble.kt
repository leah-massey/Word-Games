class Unscramble {

    // select randomWord from list
    // scramble the word
    // receive a guessedWord
    // compare guessedWord with the randomWord
    // if correct, congratulate and exit program
    // if incorrect show randomWord and exit program


    fun randomWord(wordList: List<String> = listOf("pound", "trice", "hired", "comma", "logic")): String {
        val randomIndex: Int = (0 .. (wordList.size -1)).shuffled().first()
        return wordList[randomIndex]
    }



}