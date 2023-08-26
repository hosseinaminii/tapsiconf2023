package com.example.tapsiconf

import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class GithubRepository {
    private val httpClient = httpClient {
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