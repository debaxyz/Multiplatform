package com.debaxyz.tense

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform