import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UnscrambleTest {

    @Test
    fun `a word is randomly selected from the list provided as argument`() {
        val unscrambleGame = UnscrambleGame()
        val wordList: List<String> = listOf("pound", "trice", "hired", "comma", "logic")
        val word = unscrambleGame.selectRandomWord()

        val isInList: Boolean = wordList.contains(word)

        assertTrue(isInList, "$word is in the wordList")
    }


}