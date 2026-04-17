package com.charlesmccullough.bookpedia.book.presentation.book_list.bookpedia.book.presentation.book_list

import com.charlesmccullough.bookpedia.book.data.Book
import com.plcoding.bookpedia.core.presentation.UiText

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        authors = listOf("Author $it"),
        description = "Description $it",
        imageUrl = "https://picsum.photos/200/300?random=$it",
        languages = emptyList(),
        averageRating = 4.5895,
        ratingsCount = 5,
        numPages = 100,
        numEditions = 3,
        firstPublishYear = "2000"
    )
}
data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)