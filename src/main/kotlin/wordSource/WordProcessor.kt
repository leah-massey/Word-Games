package wordSource
import java.io.File

class WordProcessor() {

    val filePath = "src/main/kotlin/wordSource/words.txt"
    val wordsAsList: List<String> =File(filePath).readLines()
    fun findFiveLetterWords(): List<String>{
        return wordsAsList.filter { it.length == 5}
    }
}