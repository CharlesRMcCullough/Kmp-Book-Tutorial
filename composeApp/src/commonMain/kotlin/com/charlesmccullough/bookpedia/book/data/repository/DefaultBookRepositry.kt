package com.charlesmccullough.bookpedia.book.data.repository

import com.charlesmccullough.bookpedia.book.data.network.RemoteBookDataSource
import com.charlesmccullough.bookpedia.book.domain.Book
import com.charlesmccullough.bookpedia.core.domain.DataError
import com.charlesmccullough.bookpedia.core.domain.Result

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
) {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource.searchBooks(query)
    }
}