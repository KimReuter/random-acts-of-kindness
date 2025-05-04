package com.example.randomactsofkindness.ui.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.randomactsofkindness.repositories.GoodDeedRepository
import com.example.randomactsofkindness.data.GoodDeed
import com.example.randomactsofkindness.data.goodDeeds
import com.example.randomactsofkindness.ui.helpers.FilterState

class HomeScreenViewModel : ViewModel() {

    private val repository = GoodDeedRepository

    private val _filterState = mutableStateOf(FilterState())
    val filterState = _filterState

    private val _filterExpanded = mutableStateOf(false)
    val filterExpanded = _filterExpanded

    private val _selectedDeed = mutableStateOf<GoodDeed?>(null)
    val selectedDeed = _selectedDeed

    private val _openSheet = mutableStateOf(false)
    val openSheet = _openSheet

    val visibleGoodDeeds = repository.visibleDeeds

    fun setFilter(filter: FilterState) {
        _filterState.value = filter
        loadFilteredGoodDeeds()
    }

    fun clearFilter() {
        _filterState.value = FilterState()
        loadFilteredGoodDeeds()
    }

    fun toggleFilterExpanded() {
        _filterExpanded.value = !_filterExpanded.value
    }

    fun selectDeed(deed: GoodDeed) {
        _selectedDeed.value = deed
        _openSheet.value = true
    }

    fun dismissSheet() {
        _openSheet.value = false
    }

    fun updateGoodDeedStatus(id: String, done: Boolean) {
        repository.updateDeedStatus(id, done)
    }

    fun loadFilteredGoodDeeds(limit: Int = 3) {
        val filtered = goodDeeds.filter { deed ->
            (_filterState.value.time == null || deed.timeRequired == _filterState.value.time) &&
                    (_filterState.value.requiredMoney == null || deed.requiredMoney == _filterState.value.requiredMoney) &&
                    (_filterState.value.difficulty == null || deed.difficulty == _filterState.value.difficulty) &&
                    (_filterState.value.socialInteraction == null || deed.socialInteraction == _filterState.value.socialInteraction)
        }.shuffled().take(limit)

        repository.loadDeeds(filtered)
    }
}
