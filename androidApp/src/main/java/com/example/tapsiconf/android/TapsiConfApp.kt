package com.example.tapsiconf.android

import android.app.Application
import com.example.tapsiconf.di.coreModule
import com.example.tapsiconf.di.repositoryModule
import com.example.tapsiconf.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class TapsiConfApp: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@TapsiConfApp)
            modules(coreModule, repositoryModule, viewModelModule)
        }
    }
}