package com.example.randomactsofkindness.ui.components.profilescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProgressBarSection(completed: Int, total: Int) {
    Column {
        LinearProgressIndicator(
            progress = if (total != 0) completed / total.toFloat() else 0f,
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp),
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "$completed von $total guten Taten erledigt",
            modifier = Modifier.padding(top = 4.dp),
            color = Color.White,
            fontSize = 14.sp
        )
    }
}
