package lms_127

fun task9(sentence: String, character: Char): Boolean {
   val result = sentence.contains(character, ignoreCase = true)
    return result
}
fun main(){
    println(task9(sentence = "I code In KOTLIN", character = 'i'))




}