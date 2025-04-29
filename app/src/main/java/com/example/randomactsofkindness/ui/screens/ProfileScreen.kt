package com.example.randomactsofkindness.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.randomactsofkindness.ui.components.CompletedActItem
import com.example.randomactsofkindness.ui.components.ProfileStatsSection
import com.example.randomactsofkindness.ui.components.ProgressBarSection
import com.example.randomactsofkindness.ui.viewmodels.ProfileScreenViewModel

@Composable
fun ProfileScreen(viewModel: ProfileScreenViewModel = viewModel()) {
    val completedActs by viewModel.completedActs.collectAsState()
    val points by viewModel.points.collectAsState()
    val level by viewModel.level.collectAsState()
    val totalActs = viewModel.totalActs

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item { Text("Dein Profil", fontSize = 28.sp, fontWeight = FontWeight.Bold) }

        item {

            Card(
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth(),
                colors = androidx.compose.material3.CardDefaults.cardColors(
                    containerColor = Color.White.copy(alpha = 0.7f)
                )
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    ProfileStatsSection(level = level, points = points)
                    Spacer(modifier = Modifier.height(16.dp))
                    ProgressBarSection(completed = completedActs.size, total = totalActs)
                }

            }
        }

        item { Text("Erledigte Aufgaben", fontSize = 20.sp, fontWeight = FontWeight.SemiBold) }

        items(completedActs) { act ->
            CompletedActItem(act)
        }
    }
}
