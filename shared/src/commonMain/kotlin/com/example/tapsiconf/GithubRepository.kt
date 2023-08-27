package com.example.tapsiconf

import com.example.tapsiconf.response.ItemResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class GithubRepository(private val httpClient: HttpClient) {
    suspend fun getRepos(): List<ItemResponse> {
        return try {
            httpClient.get(urlString = "/orgs/android/repos").body()
        } catch (e: Exception) {
            emptyList()
        }
    }
}