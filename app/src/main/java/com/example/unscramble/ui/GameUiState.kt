package com.example.unscramble.ui

import androidx.compose.runtime.mutableStateOf
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class GameUiState(
    val currentScrambledWord: String = "",
    val currentWordCount: Int = 1,
    val score: Int = 0,
    val isGuessedWordWrong: Boolean = false,
    val isGameOver: Boolean = false
)