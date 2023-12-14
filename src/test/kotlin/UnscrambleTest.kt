import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class UnscrambleTest {

    @Test
    fun `a word is randomly selected from the list provided as argument`() {
        val unscramble = Unscramble()
        val wordList: List<String> = listOf("pound", "trice", "hired", "comma", "logic")
        val word = unscramble.randomWord()

        val isInList: Boolean = wordList.contains(word)

        assertTrue(isInList, "$word is in the wordList")
    }


}