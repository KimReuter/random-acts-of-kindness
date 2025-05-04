package com.example.randomactsofkindness.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.randomactsofkindness.ui.components.GlassMorphismCard
import com.example.randomactsofkindness.ui.components.profilescreen.CompletedActItem
import com.example.randomactsofkindness.ui.components.profilescreen.ProfileStatsSection
import com.example.randomactsofkindness.ui.components.profilescreen.ProgressBarSection
import com.example.randomactsofkindness.ui.viewmodels.ProfileScreenViewModel

@Composable
fun ProfileScreen(viewModel: ProfileScreenViewModel = viewModel()) {
    val completedActs by viewModel.completedActs.collectAsState()
    val points by viewModel.points.collectAsState()
    val level by viewModel.level.collectAsState()
    val totalActs = viewModel.numberOfActs

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {

            GlassMorphismCard(
                modifier = Modifier
                    .fillMaxWidth(),
                blurRadius = 32.dp
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

        item { Text(
            text = "Erledigte Aufgaben",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White
        ) }

        items(completedActs) { act ->
            CompletedActItem(act)
        }
    }
}
