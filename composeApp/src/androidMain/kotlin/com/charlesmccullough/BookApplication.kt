package com.charlesmccullough

import android.app.Application
import com.charlesmccullough.bookpedia.di.initKoin
import org.koin.android.ext.koin.androidContext

class BookApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@BookApplication)
        }
    }
}