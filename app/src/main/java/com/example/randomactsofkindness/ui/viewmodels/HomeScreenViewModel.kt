package com.example.randomactsofkindness.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.randomactsofkindness.data.RandomAct
import com.example.randomactsofkindness.data.randomActs
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.UUID

class HomeScreenViewModel : ViewModel() {

    private val _visibleRandomActs = MutableStateFlow<List<RandomAct>>(emptyList())
    val visibleRandomActs = _visibleRandomActs.asStateFlow()

    private val allRandomActs = randomActs

    fun loadRandomActs(limit: Int = 3) {
        _visibleRandomActs.value = allRandomActs.shuffled().take(limit).distinctBy { it.id }
    }

    fun updateRandomActStatus(id: UUID, done: Boolean) {
        _visibleRandomActs.value = _visibleRandomActs.value.map {
            if (it.id == id) it.copy(done = done) else it
        }
    }
}