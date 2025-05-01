package org.example

fun multiplesOf3Or5(input: Int): Int {
    var sum = 0
    for (num in 3..<input) {
        sum += if (num % 3 == 0 || num % 5 == 0) num else 0
    }
    return sum
}