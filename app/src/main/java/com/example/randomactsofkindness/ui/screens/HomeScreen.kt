package com.example.randomactsofkindness.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.randomactsofkindness.R
import com.example.randomactsofkindness.data.GoodDeed
import com.example.randomactsofkindness.ui.helpers.TabItem
import com.example.randomactsofkindness.ui.components.AppNavHost
import com.example.randomactsofkindness.ui.components.GlassMorphismCard
import com.example.randomactsofkindness.ui.components.homescreen.FilterBar
import com.example.randomactsofkindness.ui.components.homescreen.GlassButton
import com.example.randomactsofkindness.ui.components.homescreen.GreetingCard
import com.example.randomactsofkindness.ui.components.homescreen.GoodDeedCard
import com.example.randomactsofkindness.ui.components.homescreen.GoodDeedDetailSheet
import com.example.randomactsofkindness.ui.components.homescreen.ReasonCard
import com.example.randomactsofkindness.ui.helpers.FilterState
import com.example.randomactsofkindness.ui.helpers.GoodDeedSheetHandler
import com.example.randomactsofkindness.ui.viewmodels.HomeScreenViewModel
import kotlinx.serialization.Serializable

@Composable
fun HomeScreen(viewModel: HomeScreenViewModel = viewModel()) {
    val background = painterResource(id = R.drawable.kindness_hands)
    val navController = rememberNavController()
    var selectedTab by rememberSaveable { mutableStateOf(TabItem.HOME) }

    val goodDeeds by viewModel.visibleGoodDeeds.collectAsState()
    val filterState by viewModel.filterState
    val filterExpanded by viewModel.filterExpanded
    val selectedDeed by viewModel.selectedDeed
    val openSheet by viewModel.openSheet

    LaunchedEffect(Unit) { viewModel.setFilter(filterState) }

    Box {
        Image(
            painter = background,
            contentDescription = "background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Scaffold(
            containerColor = Color.Transparent,
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
                    LazyColumn(
                        contentPadding = PaddingValues(top = 8.dp, bottom = 80.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        item {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 16.dp, vertical = 8.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                GlassButton(
                                    text = "Aktualisieren",
                                    onClick = { viewModel.loadFilteredGoodDeeds() },
                                    icon = {
                                        Icon(Icons.Default.Refresh, contentDescription = "Aktualisieren")
                                    }
                                )

                                GlassButton(
                                    text = "Filter",
                                    onClick = { viewModel.toggleFilterExpanded() },
                                    icon = {
                                        Icon(Icons.Default.List, contentDescription = "Filter")
                                    }
                                )
                            }
                        }

                        item {
                            AnimatedVisibility(visible = filterExpanded) {
                                GlassMorphismCard(
                                    modifier = Modifier
                                        .padding(horizontal = 16.dp)
                                        .fillMaxWidth()
                                ) {
                                    FilterBar(
                                        currentFilter = filterState,
                                        onFilterChange = { newFilter ->
                                            viewModel.setFilter(newFilter)
                                        },
                                        onClearFilters = {
                                            viewModel.clearFilter()
                                        }
                                    )
                                }
                            }
                        }

                        item { GreetingCard() }

                        items(goodDeeds) { goodDeed ->
                            GoodDeedCard(
                                goodDeed = goodDeed,
                                isRotating = openSheet && selectedDeed?.id == goodDeed.id,
                                onClick = {
                                    viewModel.selectDeed(goodDeed)
                                }
                            )
                        }

                        item { ReasonCard() }
                    }
                },
                profileScreenContent = {
                    ProfileScreen()
                }
            )
        }

        GoodDeedSheetHandler(
            selectedDeed = selectedDeed,
            openSheet = openSheet,
            onDismiss = { viewModel.dismissSheet() },
            onCheckedChange = { checked ->
                viewModel.updateGoodDeedStatus(selectedDeed!!.id.toString(), checked)
            }
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}