package com.example.tapsiconf

import com.example.tapsiconf.response.ItemResponse
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.get
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

    suspend fun getRepos(): List<ItemResponse> {
        return try {
            httpClient.get(urlString = "/orgs/android/repos").body()
        } catch (e: Exception) {
            emptyList()
        }
    }
}