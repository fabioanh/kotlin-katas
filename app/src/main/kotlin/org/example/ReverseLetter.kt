package org.example

fun reverseLetter(input: String): String {
    val alphabetRegex = Regex("[^A-Za-z]")
    val response = input.replace(alphabetRegex, "")
    return response.reversed()
}