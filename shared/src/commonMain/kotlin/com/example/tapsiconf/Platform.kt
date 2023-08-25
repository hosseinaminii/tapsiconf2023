package com.example.tapsiconf

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform