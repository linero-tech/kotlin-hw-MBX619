package lms_129

fun task2(number: Int): Boolean {
    var result = true

    if (number < 2) {
        result = false
    } else {
        for (i in 2 until number) {
            if (number % i == 0) {
                result = false
                break
            }
        }
    }
    return result
}
fun main (){
    val number = 5
    val isPrime = task2(number)
    println("$isPrime")
}
