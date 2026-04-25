package com.charlesmccullough.bookpedia.book.presentation.book_detail.components

import com.charlesmccullough.bookpedia.book.domain.Book

data class BookDetailState (
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)