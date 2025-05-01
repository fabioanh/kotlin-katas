package org.example

import kotlin.test.Test
import kotlin.test.assertEquals


class ReverseLetterTest {

    @Test
    fun reverseLetter_emptyString_successful() {
        // given
        val input = ""
        // when
        val result = reverseLetter(input)
        // then
        assertEquals("", result)
    }

    @Test
    fun reverseLetter_basicString_successful() {
        // given
        val input = "input"
        val expectedResult = "tupni"
        // when
        val result = reverseLetter(input)
        // then
        assertEquals(expectedResult, result)
    }

    @Test
    fun reverseLetter_basicTests_successful(){
        // given
        // when
        // then
        assertEquals("nahsirk", reverseLetter("krishan"))
        assertEquals("nortlu", reverseLetter("ultr53o?n"))
        assertEquals("cba", reverseLetter("ab23c"))
        assertEquals("nahsirk", reverseLetter("krish21an"))
    }
}