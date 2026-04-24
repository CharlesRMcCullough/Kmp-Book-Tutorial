package com.charlesmccullough

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.charlesmccullough.bookpedia.book.presentation.book_list.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.charlesmccullough.bookpedia.book.presentation.book_list.bookpedia.book.presentation.book_list.BookListViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    val viewModel = koinViewModel<BookListViewModel>()

    BookListScreenRoot(
        viewModel = viewModel,
        onBookClick = {

        }
    )
}