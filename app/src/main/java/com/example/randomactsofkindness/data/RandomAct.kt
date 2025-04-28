package com.example.randomactsofkindness.data

import java.util.UUID

data class RandomAct (
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val description: String,
    val difficulty: Difficulty,
    val cost: Cost,
    val timeRequired: TimeRequired,
    val socialInteraction: SocialInteraction,
    var done: Boolean = false
)