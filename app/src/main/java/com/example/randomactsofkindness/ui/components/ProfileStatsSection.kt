package com.example.randomactsofkindness.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun ProfileStatsSection(level: String, points: Int) {
    Column {
        Text("Level: $level", fontSize = 20.sp)
        Text("Punkte: $points", fontSize = 18.sp, color = Color.Gray)
    }
}