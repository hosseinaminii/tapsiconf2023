package com.example.tapsiconf.di

import com.example.tapsiconf.GithubRepository
import com.example.tapsiconf.httpClient
import com.example.tapsiconf.viewModel.GithubViewModel
import com.example.tapsiconf.viewModel.SharedViewModel
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.definition.Definition
import org.koin.core.definition.KoinDefinition
import org.koin.core.module.Module
import org.koin.core.qualifier.Qualifier
import org.koin.dsl.module

expect inline fun <reified T : SharedViewModel> Module.sharedViewModel(
    qualifier: Qualifier? = null,
    noinline definition: Definition<T>
): KoinDefinition<T>

val coreModule = module {
    single {
        httpClient {
            expectSuccess = true // To throw exception in case of error occurrence
            defaultRequest {
                url("https://api.github.com") // Base URL for all requests
            }
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                })
            }
        }
    }
}

val repositoryModule = module {
    single {
        GithubRepository(get())
    }
}

val viewModelModule = module {
    sharedViewModel { GithubViewModel(get()) }
}