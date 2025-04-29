package com.example.randomactsofkindness.data

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.util.UUID

object RandomActRepository {

    private val _allActs = MutableStateFlow<List<RandomAct>>(emptyList())
    val allActs: StateFlow<List<RandomAct>> = _allActs

    fun loadActs(newActs: List<RandomAct>) {
        val current = _allActs.value

        val updated = newActs.map { new ->
            current.find { it.id == new.id }?.let { existing ->
                new.copy(done = existing.done)
            } ?: new
        }
        _allActs.value = updated
    }

    fun updateActStatus(id: String, done: Boolean) {
        val uuid = UUID.fromString(id)
        _allActs.value = _allActs.value.map {
            if (it.id == uuid) it.copy(done = done) else it
        }
    }
}