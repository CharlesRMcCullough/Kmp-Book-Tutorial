package com.charlesmccullough.bookpedia.book.data.network

import com.charlesmccullough.bookpedia.book.data.dto.BookWorkDto
import com.charlesmccullough.bookpedia.book.data.dto.SearchResponseDto
import com.charlesmccullough.bookpedia.core.domain.DataError
import com.charlesmccullough.bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}