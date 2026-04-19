package com.charlesmccullough.bookpedia.book.data.repository

import com.charlesmccullough.bookpedia.book.data.mappers.toBook
import com.charlesmccullough.bookpedia.book.data.network.RemoteBookDataSource
import com.charlesmccullough.bookpedia.book.domain.Book
import com.charlesmccullough.bookpedia.book.domain.BookRepository
import com.charlesmccullough.bookpedia.core.domain.DataError
import com.charlesmccullough.bookpedia.core.domain.Result
import com.charlesmccullough.bookpedia.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
) : BookRepository {
    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }
}