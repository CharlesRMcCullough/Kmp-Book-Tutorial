package com.charlesmccullough.bookpedia.book.presentation.book_list.bookpedia.book.presentation.book_list

import com.charlesmccullough.bookpedia.book.data.Book

sealed interface BookListAction {
    data class OnSearchQueryChange(val query: String): BookListAction
    data class OnBookClick(val book: Book) : BookListAction
    data class OnTabSelected(val index: Int) : BookListAction
}