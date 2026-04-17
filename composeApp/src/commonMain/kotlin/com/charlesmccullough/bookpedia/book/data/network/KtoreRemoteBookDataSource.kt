package com.charlesmccullough.bookpedia.book.data.network

import com.charlesmccullough.bookpedia.book.domain.Book
import io.ktor.client.HttpClient
import kmp_book_tutorial.composeapp.generated.resources.Res

class KtoreRemoteBookDataSource(
    private val httpClient: HttpClient
) {
    suspend fun searchBooks(
        query: String,
        resultsLimit: Int? = null
    ): Result<List<Book>>
}
