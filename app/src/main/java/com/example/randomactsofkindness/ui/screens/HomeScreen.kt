package com.example.randomactsofkindness.ui.screens

import android.graphics.Color.alpha
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.randomactsofkindness.R
import com.example.randomactsofkindness.data.Cost
import com.example.randomactsofkindness.data.Difficulty
import com.example.randomactsofkindness.data.RandomAct
import com.example.randomactsofkindness.data.SocialInteraction
import com.example.randomactsofkindness.data.TabItem
import com.example.randomactsofkindness.data.TimeRequired
import com.example.randomactsofkindness.ui.components.AppNavHost
import com.example.randomactsofkindness.ui.components.GreetingCard
import com.example.randomactsofkindness.ui.components.RandomActCard
import com.example.randomactsofkindness.ui.components.RandomActDetailSheet
import com.example.randomactsofkindness.ui.components.ReasonCard
import com.example.randomactsofkindness.ui.viewmodels.HomeScreenViewModel
import kotlinx.serialization.Serializable

@Serializable
object HomeRoute

@Serializable
object ProfileRoute

@Composable
fun HomeScreen(viewModel: HomeScreenViewModel = viewModel()) {
    val randomActs by viewModel.visibleRandomActs.collectAsState()

    var openSheet by remember { mutableStateOf(false) }
    var selectedRandomAct by remember { mutableStateOf<RandomAct?>(null) }

    val background = painterResource(id = R.drawable.kindness_hands)
    val navController = rememberNavController()
    var selectedTab by rememberSaveable { mutableStateOf(TabItem.Home) }

    LaunchedEffect(Unit) { viewModel.loadRandomActs() }

    Box {
        Image(
            painter = background,
            contentDescription = "background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Scaffold(
            containerColor = Color.Transparent,
            floatingActionButton = {
                FloatingActionButton(onClick = { viewModel.loadRandomActs() }) {
                    Icon(imageVector = Icons.Filled.Refresh, contentDescription = "Refresh")
                }
            },
            bottomBar = {
                NavigationBar(
                    containerColor = Color.Transparent
                ) {
                    TabItem.entries.forEach { tabItem ->
                       NavigationBarItem(
                           selected = selectedTab == tabItem,
                           onClick = { selectedTab = tabItem },
                           icon = {
                               Icon(
                                   imageVector = tabItem.tabIcon,
                                   contentDescription = "TabItem"
                               )
                           }
                       )
                    }
                }
            }
        ) { innerPadding ->
            AppNavHost(
                navController = navController,
                selectedTab = selectedTab,
                onTabChange = { selectedTab = it },
                innerPadding = innerPadding,
                homeScreenContent = {
                    Column(
                        modifier = Modifier.padding(innerPadding).fillMaxSize()
                    ) {
                        GreetingCard()
                        randomActs.forEach { randomAct ->
                            RandomActCard(
                                randomAct = randomAct,
                                isRotating = openSheet && selectedRandomAct?.id == randomAct.id,
                                onClick = {
                                    selectedRandomAct = randomAct
                                    openSheet = true
                                }
                            )
                        }
                        ReasonCard()
                    }
                },
                profileScreenContent = {

                }
            )
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