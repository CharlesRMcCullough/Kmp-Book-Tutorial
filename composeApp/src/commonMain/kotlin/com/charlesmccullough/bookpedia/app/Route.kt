package com.charlesmccullough.bookpedia.app

import kotlinx.serialization.Serializable

sealed interface Route {

    @Serializable
    data object BookGraph: Route
    @Serializable
    data object BoolList: Route

    @Serializable
    data class BookDetail(val id: String): Route

}