package com.example.randomactsofkindness.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.randomactsofkindness.data.Cost
import com.example.randomactsofkindness.data.Difficulty
import com.example.randomactsofkindness.data.RandomAct
import com.example.randomactsofkindness.data.SocialInteraction
import com.example.randomactsofkindness.data.TimeRequired
import com.example.randomactsofkindness.ui.components.RandomActDetailSheet
import com.example.randomactsofkindness.ui.components.ReasonCard
import com.example.randomactsofkindness.ui.viewmodels.HomeScreenViewModel

@Composable
fun HomeScreen(
    viewModel: HomeScreenViewModel = viewModel()
) {
    val randomActs by viewModel.visibleRandomActs.collectAsState()

    viewModel.loadRandomActs()

    var openSheet by remember { mutableStateOf(false) }
    var selectedRandomAct by remember { mutableStateOf<RandomAct?>(null) }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    viewModel.loadRandomActs()
                }
            ) {
                Icon(imageVector = Icons.Filled.Refresh, contentDescription = "Refresh")
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Text(
                text = "Home",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Card(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(8.dp)
                ) {
                    Text(
                        text = "Hey Kim, wie geht's dir heute?"
                    )
                }
            }

            ReasonCard()

            randomActs.forEach { randomAct ->
                Card(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .clickable {
                            selectedRandomAct = randomAct
                            openSheet = true
                        }
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = randomAct.title,
                            modifier = Modifier.weight(1f),
                            fontSize = 18.sp
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Icon(
                            imageVector = Icons.Filled.ArrowForward,
                            contentDescription = "mehr Details",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

            }
        }
    }

    if (openSheet && selectedRandomAct != null) {
        RandomActDetailSheet(
            randomAct = selectedRandomAct!!,
            onDismiss = { openSheet = false },
            onCheckedChange = { checked ->
                viewModel.updateRandomActStatus(selectedRandomAct!!.id, checked)
            }
        )
    }
}



@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    val exampleRandomAct = RandomAct(
        title = "Hilf einem Nachbarn",
        description = "Biete deinem Nachbarn an, seine Einkäufe zu tragen.",
        difficulty = Difficulty.Easy,
        cost = Cost.No_Cost,
        timeRequired = TimeRequired.Short,
        socialInteraction = SocialInteraction.With_Others
    )

    HomeScreen()
}