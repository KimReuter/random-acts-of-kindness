package com.example.randomactsofkindness.data

import com.example.randomactsofkindness.data.goodDeedProperties.RequiredMoney
import com.example.randomactsofkindness.data.goodDeedProperties.Difficulty
import com.example.randomactsofkindness.data.goodDeedProperties.SocialInteraction
import com.example.randomactsofkindness.data.goodDeedProperties.TimeRequired
import java.util.UUID

data class GoodDeed (
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val description: String,
    val difficulty: Difficulty,
    val requiredMoney: RequiredMoney,
    val timeRequired: TimeRequired,
    val socialInteraction: SocialInteraction,
    var done: Boolean = false
)