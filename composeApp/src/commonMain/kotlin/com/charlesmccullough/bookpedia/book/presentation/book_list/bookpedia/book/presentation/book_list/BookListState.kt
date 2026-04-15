package com.charlesmccullough.bookpedia.book.presentation.book_list.bookpedia.book.presentation.book_list

import com.charlesmccullough.bookpedia.book.data.Book
import com.plcoding.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedIndex: Int = 0,
    val errorMessage: UiText? = null
)