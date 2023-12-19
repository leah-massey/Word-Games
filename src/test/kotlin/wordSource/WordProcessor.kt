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
}