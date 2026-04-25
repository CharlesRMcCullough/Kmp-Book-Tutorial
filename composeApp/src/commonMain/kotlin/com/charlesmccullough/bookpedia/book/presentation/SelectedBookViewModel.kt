package com.charlesmccullough.bookpedia.book.presentation.book_list

import androidx.lifecycle.ViewModel
import com.charlesmccullough.bookpedia.book.domain.Book
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SelectedBookViewModel : ViewModel() {

    private val __selectedBook = MutableStateFlow<Book?>(null)
    val selectedBook = __selectedBook.asStateFlow()

    fun onSelectedBook(book: Book?) {
        __selectedBook.value = book
    }
}