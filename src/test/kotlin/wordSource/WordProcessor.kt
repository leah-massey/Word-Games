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
}