package org.example

import kotlin.test.Test
import kotlin.test.assertEquals

class MiddleCharacterTest {

    @Test
    fun getMiddleCharacter_emptyString_emptyResult() {
        // given
        val input = ""
        // when
        val result = getMiddleCharacter(input)
        // then
        assertEquals("", result)
    }

    @Test
    fun getMiddleCharacter_oddString_singleLetterResult() {
        // given
        val input = "odd"
        // when
        val result = getMiddleCharacter(input)
        // then
        assertEquals("d", result)
    }

    @Test
    fun getMiddleCharacter_evenString_doubleLetterResult() {
        // given
        val input = "even"
        // when
        val result = getMiddleCharacter(input)
        // then
        assertEquals("ve", result)
    }

    @Test
    fun codesOfWarTest() {
        assertEquals("es", getMiddleCharacter("test"));
        assertEquals("dd", getMiddleCharacter("middle"));
        assertEquals("t", getMiddleCharacter("testing"));
        assertEquals("A", getMiddleCharacter("A"));
    }
}