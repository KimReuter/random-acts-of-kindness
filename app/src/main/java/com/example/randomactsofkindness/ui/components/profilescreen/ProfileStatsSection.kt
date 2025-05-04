package com.example.randomactsofkindness.ui.components.profilescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun ProfileStatsSection(level: String, points: Int) {
    Column {
        Text(
            text = "Level: $level",
            fontSize = 20.sp,
            color = Color.White
            )
        Text("Punkte: $points", fontSize = 18.sp, color = Color.Gray)
    }
}