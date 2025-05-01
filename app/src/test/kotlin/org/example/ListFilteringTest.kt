package org.example

import kotlin.test.Test
import kotlin.test.assertEquals

class ListFilteringTest {
    @Test
    fun filterList_emptyList_emptyResult(){
        // given
        val input = emptyList<Any>()
        // when
        val response = filterList(input)
        // then
        assertEquals(emptyList(), response)
    }

    @Test
    fun filterList_intList_intListNoFilter(){
        // given
        val input = listOf(1, 2, 5, 3)
        // when
        val response = filterList(input)
        // then
        assertEquals(listOf(1, 2, 5, 3), response)
    }

    @Test
    fun filterList_mixedInputList_filteredList(){
        // given
        val input = listOf(1, 2,"a", 5, 3, byteArrayOf(123))
        // when
        val response = filterList(input)
        // then
        assertEquals(listOf(1, 2, 5, 3), response)
    }
}