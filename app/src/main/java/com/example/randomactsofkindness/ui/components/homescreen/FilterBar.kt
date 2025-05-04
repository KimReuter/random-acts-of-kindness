package com.example.randomactsofkindness.ui.components.homescreen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.example.randomactsofkindness.data.goodDeedProperties.Difficulty
import com.example.randomactsofkindness.data.goodDeedProperties.LabeledEnum
import com.example.randomactsofkindness.data.goodDeedProperties.RequiredMoney
import com.example.randomactsofkindness.data.goodDeedProperties.SocialInteraction
import com.example.randomactsofkindness.data.goodDeedProperties.TimeRequired
import com.example.randomactsofkindness.ui.components.GlassMorphismCard
import com.example.randomactsofkindness.ui.helpers.FilterState

@Composable
fun FilterBar(
    currentFilter: FilterState,
    onFilterChange: (FilterState) -> Unit,
    onClearFilters: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        DropdownSelector("Zeitaufwand", TimeRequired.entries, currentFilter.time) {
            onFilterChange(currentFilter.copy(time = it))
        }
        DropdownSelector("Schwierigkeit", Difficulty.entries, currentFilter.difficulty) {
            onFilterChange(currentFilter.copy(difficulty = it))
        }
        DropdownSelector("Ressourcen", RequiredMoney.entries, currentFilter.requiredMoney) {
            onFilterChange(currentFilter.copy(requiredMoney = it))
        }
        DropdownSelector(
            "Soziale Interaktion",
            SocialInteraction.entries,
            currentFilter.socialInteraction
        ) {
            onFilterChange(currentFilter.copy(socialInteraction = it))
        }
        Button(
            onClick = onClearFilters,
            colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)
        ) {
            Text("Filter zurücksetzen")
        }
    }
}


@Composable
fun <T> DropdownSelector(
    label: String,
    options: List<T>,
    selected: T?,
    onSelected: (T?) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    Column {
        Text(label, style = MaterialTheme.typography.bodyMedium, color = Color.White)
        Box {
            OutlinedButton(
                onClick = { expanded = true },
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.White.copy(alpha = 0.1f),
                    contentColor = Color.White
                ),
                border = ButtonDefaults.outlinedButtonBorder.copy(
                    brush = SolidColor(Color.White)
                )
            ) {
                Text(
                    text = if (selected == null) "Alle"
                    else (selected as? LabeledEnum)?.label ?: selected.toString(),
                    color = Color.White
                )
            }
            DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                DropdownMenuItem(text = { Text("Alle") }, onClick = {
                    onSelected(null)
                    expanded = false
                })
                options.forEach { option ->
                    DropdownMenuItem(
                        text = {
                            Text((option as? LabeledEnum)?.label ?: option.toString())
                        },
                        onClick = {
                            onSelected(option)
                            expanded = false
                        }
                    )
                }
            }
        }
    }
}
