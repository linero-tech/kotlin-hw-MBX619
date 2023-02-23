package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {
    // Do not change or delete these variables
    var a = valueForA
    var b = valueForB

    val temporary = a
    a = b
    b = temporary

    // Do not erase or change this statement
    return Pair(a, b)
}
 fun main() {
    print(task5(valueForA= 20, valueForB= 55))//a=55 b=20


 }