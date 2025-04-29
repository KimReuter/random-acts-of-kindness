package com.example.randomactsofkindness.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.randomactsofkindness.data.RandomActRepository
import com.example.randomactsofkindness.data.randomActs

class HomeScreenViewModel : ViewModel() {

    private val repository = RandomActRepository

    val visibleRandomActs = repository.visibleActs

    fun loadRandomActs(limit: Int = 3) {
        val newActs = randomActs.shuffled().take(limit).distinctBy { it.id }
        repository.loadActs(newActs)
    }

    fun updateRandomActStatus(id: String, done: Boolean) {
        repository.updateActStatus(id, done)
    }
}