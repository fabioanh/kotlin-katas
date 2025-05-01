package org.example

object StockList {
    fun stockSummary(books: Array<String>, categories: Array<String>): String {
        if (books.isEmpty() || categories.isEmpty()) {
            return ""
        }
        // count by category
        val countByCategory: List<Int> = categories.map { category ->
            books.filter { it.startsWith(category) }
                .map { it.substring(it.indexOf(" ") + 1) }
                .sumOf { Integer.valueOf(it) }
        }
        // join categories and counts
        val summary = categories.zip(countByCategory) { category, count -> "($category : $count)" }
        return summary.joinToString(separator = " - ")
    }

    fun stockSummaryV2(books: Array<String>, categories: Array<String>): String {
        if (books.isEmpty() || categories.isEmpty()) return ""
        // count by category
        val countsMap: Map<Char, Int> = books.groupingBy { it.first() }
            .fold(0) { accumulator, element ->
                accumulator + (element.substring(element.indexOf(" ") + 1).toInt())
            }
        return categories.joinToString(" - ") { "($it : ${countsMap.getOrDefault(it.single(), 0)})" }
    }
}