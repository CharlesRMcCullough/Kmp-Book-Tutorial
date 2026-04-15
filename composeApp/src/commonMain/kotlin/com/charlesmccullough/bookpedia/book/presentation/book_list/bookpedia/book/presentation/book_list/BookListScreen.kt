package com.charlesmccullough.bookpedia.book.presentation.book_list.bookpedia.book.presentation.book_list

import androidx.compose.runtime.Composable
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.charlesmccullough.bookpedia.book.data.Book
import com.charlesmccullough.bookpedia.book.presentation.book_list.bookpedia.book.presentation.book_list.BookListState
import com.charlesmccullough.bookpedia.book.presentation.book_list.bookpedia.book.presentation.book_list.BookListViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun BookListScreenRoot(
    viewModel: BookListViewModel = koinViewModel(),
    onBookClick: (Book) -> Unit,
) {
    val state = viewModel.state.collectAsStateWithLifecycle()
    BookListScreen(
        state = state.value,
        onAction = { action ->
            when (action) {
                is BookListAction.OnBookClick -> onBookClick(action.book)
                else -> Unit
            }
            viewModel.onAction(action)
        }
    )
}

@Composable
private fun BookListScreen(
    state: BookListState,
    onAction: (BookListAction) -> Unit,

    ) {

}