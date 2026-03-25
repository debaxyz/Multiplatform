package com.debaxyz.tense

// ── Navigation ──────────────────────────────────────────────────────────────

enum class Screen { PRESENT, PAST, FUTURE }

sealed class NavEvent {
    data object Back : NavEvent()
    data class Navigate(val screen: Screen) : NavEvent()
}
