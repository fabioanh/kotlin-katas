package org.example

import kotlin.test.Test
import kotlin.test.assertEquals

class BooksellerTest {

    @Test
    fun stockSummary_emptyInput_emptyResult() {
        // given
        val inputArticles = emptyArray<String>()
        val inputCategories = emptyArray<String>()
        // when
        val result = StockList.stockSummary(inputArticles, inputCategories)
        // then
        assertEquals("", result)
    }

    @Test
    fun stockSummary_singleInputs_singleResult() {
        // given
        val inputArticles = arrayOf("ATCK 34")
        val inputCategories = arrayOf("A")
        // when
        val result = StockList.stockSummary(inputArticles, inputCategories)
        // then
        assertEquals("(A : 34)", result)
    }

    @Test
    fun stockSummary_basicInput_properSummary() {
        // given
        val inputArticles = arrayOf("ATCK 34", "BERT 4", "CAPS 23", "BROM 52", "CRON 10")
        val inputCategories = arrayOf("A", "B", "C")
        // when
        val result = StockList.stockSummary(inputArticles, inputCategories)
        // then
        assertEquals("(A : 34) - (B : 56) - (C : 33)", result)
    }

    @Test
    fun stockSummary_emptyCategory_zeroStockResult() {
        // given
        val inputArticles = arrayOf("ATCK 34", "BERT 4", "CAPS 23", "BROM 52", "CRON 10", "EPSA 5")
        val inputCategories = arrayOf("A", "B", "C", "D", "E")
        // when
        val result = StockList.stockSummary(inputArticles, inputCategories)
        // then
        assertEquals("(A : 34) - (B : 56) - (C : 33) - (D : 0) - (E : 5)", result)
    }
}