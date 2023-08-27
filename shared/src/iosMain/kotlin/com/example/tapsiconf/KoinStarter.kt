package com.example.tapsiconf

import com.example.tapsiconf.di.coreModule
import com.example.tapsiconf.di.repositoryModule
import com.example.tapsiconf.di.viewModelModule
import org.koin.core.context.startKoin

fun startKoin() {
    startKoin { modules(coreModule, repositoryModule, viewModelModule) }
}