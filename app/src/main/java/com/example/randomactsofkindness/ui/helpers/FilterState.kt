package com.example.randomactsofkindness.ui.helpers

import com.example.randomactsofkindness.data.goodDeedProperties.Difficulty
import com.example.randomactsofkindness.data.goodDeedProperties.RequiredMoney
import com.example.randomactsofkindness.data.goodDeedProperties.SocialInteraction
import com.example.randomactsofkindness.data.goodDeedProperties.TimeRequired

data class FilterState (
    val time: TimeRequired? = null,
    val requiredMoney: RequiredMoney? = null,
    val difficulty: Difficulty? = null,
    val socialInteraction: SocialInteraction? = null
)