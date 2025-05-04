package com.example.randomactsofkindness.repositories

import com.example.randomactsofkindness.data.GoodDeed
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.UUID

object GoodDeedRepository {

    private val _allActs = MutableStateFlow<List<GoodDeed>>(emptyList())
    val allActs = _allActs.asStateFlow()

    private val _visibleActs = MutableStateFlow<List<GoodDeed>>(emptyList())
    val visibleDeeds = _visibleActs.asStateFlow()

    fun loadDeeds(newActs: List<GoodDeed>) {
        val current = _allActs.value
        val updated = (current + newActs)
            .distinctBy { it.id }
        _allActs.value = updated
        _visibleActs.value = newActs
    }

    fun updateDeedStatus(id: String, done: Boolean) {
        val uuid = UUID.fromString(id)
        _allActs.value = _allActs.value.map {
            if (it.id == uuid) it.copy(done = done) else it
        }
    }
}