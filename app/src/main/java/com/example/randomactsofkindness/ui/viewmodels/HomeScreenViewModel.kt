package com.example.randomactsofkindness.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.randomactsofkindness.data.RandomActRepository
import com.example.randomactsofkindness.data.randomActs

class HomeScreenViewModel : ViewModel() {

    private val repository = RandomActRepository

    val visibleRandomActs = repository.allActs

    fun loadRandomActs(limit: Int = 3) {
        val acts = randomActs.shuffled().take(limit).distinctBy { it.id }
        repository.loadActs(acts)
    }

    fun updateRandomActStatus(id: String, done: Boolean) {
        repository.updateActStatus(id, done)
    }
}