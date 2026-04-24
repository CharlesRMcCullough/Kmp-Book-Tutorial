package com.charlesmccullough

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.charlesmccullough.bookpedia.book.data.network.KtorRemoteBookDataSource
import com.charlesmccullough.bookpedia.book.data.repository.DefaultBookRepository
import com.charlesmccullough.bookpedia.book.presentation.book_list.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.charlesmccullough.bookpedia.book.presentation.book_list.bookpedia.book.presentation.book_list.BookListViewModel
import com.charlesmccullough.bookpedia.core.data.HttpClientFactory
import io.ktor.client.engine.HttpClientEngine
import org.jetbrains.compose.resources.painterResource

import kmp_book_tutorial.composeapp.generated.resources.Res
import kmp_book_tutorial.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App(engine: HttpClientEngine) {
    BookListScreenRoot(
        viewModel = remember { BookListViewModel(
            bookRepository = DefaultBookRepository(
                remoteBookDataSource = KtorRemoteBookDataSource(
                    httpClient = HttpClientFactory.create(engine)
                )
            )
        ) },
        onBookClick = {

        }
    )
}