package wordSource

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class WordProcessorTest {
    @Test
    fun `return value includes specified five letter word`() {
        val underTest = WordProcessor()
        val fiveLetterWordFromList = "acute"
        val actual = underTest.findFiveLetterWords()

        assertTrue(actual.contains(fiveLetterWordFromList))
    }

    @Test
    fun `return value contains 832 words`() {
        val underTest = WordProcessor()
        val expected = 832
        val actual = underTest.findFiveLetterWords()

        assertEquals(expected, actual.size)
    }

    @Test
    fun `return value only includes five letter words`() {
        val underTest = WordProcessor()

        val actual = underTest.findFiveLetterWords()
        val onlyFiveLetterWords: List<String> = actual.filter {
            it.length == 5
        }

        assertEquals(onlyFiveLetterWords, actual)
    }
}