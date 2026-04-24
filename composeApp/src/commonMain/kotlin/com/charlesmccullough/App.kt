package com.charlesmccullough

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import com.charlesmccullough.bookpedia.book.presentation.book_list.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.charlesmccullough.bookpedia.book.presentation.book_list.bookpedia.book.presentation.book_list.BookListViewModel
import org.koin.compose.viewmodel.koinViewModel
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.toRoute
import com.charlesmccullough.bookpedia.app.Route


@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = Route.BookGraph
        ) {
            navigation<Route.BookGraph>(
                startDestination = Route.BoolList
            ) {
                composable<Route.BoolList> {
                    val viewModel = koinViewModel<BookListViewModel>()
                    BookListScreenRoot(
                        viewModel = viewModel,
                        onBookClick = { book ->
                            navController.navigate(
                                Route.BookDetail(book.id)
                            )
                        }
                    )
                }
                composable<Route.BookDetail> { entry ->
                    val args = entry.toRoute<Route.BookDetail>()

                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Book Detail Screen, The id is ${args.id}")
                    }

                }
            }
        }
    }
}