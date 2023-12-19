package games

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import wordSource.WordProcessor

class UnscrambleGameTest {
    @Test
    fun `a word is randomly selected from the list provided as argument`() {
        val wordProcessor = WordProcessor()
        val unscrambleGame = UnscrambleGame(wordProcessor)
        val wordList: List<String> = wordProcessor.findFiveLetterWords()
        val word = unscrambleGame.selectRandomWord()

        val isInList: Boolean = wordList.contains(word)

        assertTrue(isInList, "$word is in the wordList")
    }
    @Test
    fun `the chosen word's letters are randomly shuffled`() {
        val wordProcessor = WordProcessor()
        val unscrambleGame = UnscrambleGame(wordProcessor)
        val chosenWord = unscrambleGame.selectRandomWord()
        val actual = unscrambleGame.scramble()

        assertNotEquals(chosenWord, actual)
        assertEquals(chosenWord.length, actual.length)
        // show that each letter in the shuffled word is in the original word
    }

    @Test
    fun `a randomly shuffled word must always be different to the original order of letters`() {
        val wordProcessor = WordProcessor()
        val unscrambleGame = UnscrambleGame(wordProcessor)
        val chosenWord = unscrambleGame.selectRandomWord()
        val scrambledWord = unscrambleGame.scramble()

        assertNotEquals(chosenWord, scrambledWord)
    }  // how would I test properly to show and edge case scenario where a word is shuffled into its original format?

//    @Test // not sure how to test for this?
//    fun `if user solution is not a 4 letter word, prompt a second attempt`() {
//
//    }

    // testing generate and scramble - how can I do this?
//    @Test
//    fun `a string is returned`() {
//        val unscrambleGame = UnscrambleGame()
//        val expected = "hi" // I know this will fail
//        val actual = unscrambleGame.generateAndScramble()
//        assertEquals(expected, actual)
//
//    }

//    @Test
//    fun `a correct solution returns a congratulations message`() {
//        val unscrambleGame = UnscrambleGame()
//
//        val chosenWord = unscrambleGame.selectRandomWord()
//        val actual = unscrambleGame.scramble()
//
//        assertEquals(chosenWord.length, actual.length)
//
//        // show that each letter in the shuffled word is in the original word
//    }

}