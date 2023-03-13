package lms_129

fun task8(number: Int): Int {
    var result = 0
    number.toString().forEach {digit ->
        result += digit.digitToInt()
    }

    return result
}

fun main() {
    println(task8(number = 123))
}