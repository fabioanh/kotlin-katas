package org.example

fun getMiddleCharacter(input: String): String = if (input.isEmpty()) "" else if (input.length % 2 == 0) input.substring(
    input.length / 2 - 1,
    input.length / 2 + 1
) else input.substring(input.length / 2, input.length / 2 + 1)