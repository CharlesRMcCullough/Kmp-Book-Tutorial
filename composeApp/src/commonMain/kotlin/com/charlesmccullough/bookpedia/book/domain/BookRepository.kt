package com.charlesmccullough.bookpedia.book.domain

import com.charlesmccullough.bookpedia.core.domain.DataError
import com.charlesmccullough.bookpedia.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
}