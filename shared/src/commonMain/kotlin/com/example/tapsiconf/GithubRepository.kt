package com.example.tapsiconf

import io.ktor.client.plugins.defaultRequest

class GithubRepository {
    private val httpClient = httpClient {
        expectSuccess = true // To throw exception in case of error occurrence
        defaultRequest {
            url("https://api.github.com") // Base URL for all requests
        }
    }
}