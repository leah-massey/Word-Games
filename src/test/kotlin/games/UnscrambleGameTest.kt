package games

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito
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
    fun `once shuffled a words letters must be in a different order to the `() {
        val wordProcessor = WordProcessor()
        val unscrambleGame = UnscrambleGame(wordProcessor)
        val chosenWord = unscrambleGame.selectRandomWord()
        val scrambledWord = unscrambleGame.scramble()

        assertNotEquals(chosenWord, scrambledWord)
    }

    @Test
    fun `once selected, a chosen word is removed from the wordList`() {
        val wordProcessor = WordProcessor()
        val unscrambleGame = UnscrambleGame(wordProcessor)
//        val wordList = wordProcessor.wordsAsList
        val chosenWord = unscrambleGame.selectRandomWord()
        val isChosenWordInWordList = unscrambleGame.wordList.contains(chosenWord)

        assertEquals(false, isChosenWordInWordList)
    }

//    @Test
//    fun scrambleUsingMockito() {
//        val mockWordProcessor = Mockito.mock(WordProcessor::class.java)
//        val unscrambleGame = UnscrambleGame(mockWordProcessor)
//
//        assertNotNull(unscrambleGame)
//
//
//    }





//    @Test // not sure how to test for this?
//    fun `if user solution is not a 5 letter word, prompt a second attempt`() {
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