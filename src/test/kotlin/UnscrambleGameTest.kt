import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UnscrambleGameTest {

    @Test
    fun `a word is randomly selected from the list provided as argument`() {
        val unscrambleGame = UnscrambleGame()
        val wordList: List<String> = listOf("pound", "trice", "hired", "comma", "logic")
        val word = unscrambleGame.selectRandomWord()

        val isInList: Boolean = wordList.contains(word)

        assertTrue(isInList, "$word is in the wordList")
    }

    @Test
    fun `the chosen word's letters are randomly shuffled`() {
        val unscrambleGame = UnscrambleGame()
        val chosenWord = unscrambleGame.selectRandomWord()
        val actual = unscrambleGame.scramble()

        assertNotEquals(chosenWord, actual)
        assertEquals(chosenWord.length, actual.length)

    // show that each letter in the shuffled word is in the original word
    }

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