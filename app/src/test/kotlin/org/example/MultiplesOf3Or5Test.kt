package org.example

import kotlin.test.Test
import kotlin.test.assertEquals

class MultiplesOf3Or5Test {

    @Test
    fun multiplesOf3Or5_zero_zero() {
        // given
        val input = 0
        // when
        val result = multiplesOf3Or5(input)
        // then
        assertEquals(0, result)
    }

    @Test
    fun multiplesOf3Or5_basicExample_successful() {
        // given
        val input = 10
        // when
        val result = multiplesOf3Or5(input)
        // then
        assertEquals(23, result)
    }

    @Test
    fun multiplesOf3Or5_negativeNumber_zero() {
        // given
        val input = -6
        // when
        val result = multiplesOf3Or5(input)
        // then
        assertEquals(0, result)
    }
}