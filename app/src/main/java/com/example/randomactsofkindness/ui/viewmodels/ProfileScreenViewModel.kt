package com.example.randomactsofkindness.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.randomactsofkindness.repositories.GoodDeedRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import com.example.randomactsofkindness.data.goodDeeds

class ProfileScreenViewModel : ViewModel() {

    private val repository = GoodDeedRepository

    val completedActs = repository.allActs
        .map { list -> list.filter { it.done } }
        .stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())

    val numberOfActs = goodDeeds.size

    val points = completedActs.map { it.size * 10 }
        .stateIn(viewModelScope, SharingStarted.Eagerly, 0)

    val level = points.map { pts ->
        when {
            pts < 50 -> "Helper"
            pts < 150 -> "Supporter"
            pts < 300 -> "Hero"
            else -> "Legend"
        }
    }.stateIn(viewModelScope, SharingStarted.Eagerly, "Helper")
}