package com.charlesmccullough.bookpedia.book.presentation.book_list.bookpedia.book.presentation.book_list.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.plcoding.bookpedia.core.presentation.DarkBlue
import com.plcoding.bookpedia.core.presentation.SandYellow
import kmp_book_tutorial.composeapp.generated.resources.Res
import kmp_book_tutorial.composeapp.generated.resources.search_hint
import org.jetbrains.compose.resources.stringResource

@Composable
fun BookSearchBar(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onImeSearch: () -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = searchQuery,
        onValueChange = onSearchQueryChange,
        shape = RoundedCornerShape(100),
        colors = OutlinedTextFieldDefaults.colors(
            cursorColor = DarkBlue,
            focusedBorderColor = SandYellow
        ),
        placeholder = {
            Text(
                text = stringResource(Res.string.search_hint)
            )
        }
    )
}