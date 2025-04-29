package com.example.randomactsofkindness.data

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.UUID

object RandomActRepository {

    private val _allActs = MutableStateFlow<List<RandomAct>>(emptyList())
    val allActs = _allActs.asStateFlow()

    private val _visibleActs = MutableStateFlow<List<RandomAct>>(emptyList())
    val visibleActs = _visibleActs.asStateFlow()

    fun loadActs(newActs: List<RandomAct>) {
        val current = _allActs.value
        val updated = (current + newActs)
            .distinctBy { it.id } // keine doppelten IDs
        _allActs.value = updated
        _visibleActs.value = newActs
    }

    fun updateActStatus(id: String, done: Boolean) {
        val uuid = UUID.fromString(id)
        _allActs.value = _allActs.value.map {
            if (it.id == uuid) it.copy(done = done) else it
        }
    }
}