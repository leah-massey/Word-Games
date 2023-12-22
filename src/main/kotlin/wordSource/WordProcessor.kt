package wordSource
import java.io.File

class WordProcessor() {

    val filePath = javaClass.classLoader.getResource("words.txt")?.file
    val wordsAsList: List<String> =File(filePath).readLines()
    fun findFiveLetterWords(): List<String>{
        return wordsAsList.filter { it.length == 5}
    }
}