package com.charlesmccullough

import androidx.compose.ui.window.ComposeUIViewController
import com.charlesmccullough.bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }