package com.example.randomactsofkindness.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.randomactsofkindness.ui.helpers.TabItem
import kotlinx.serialization.Serializable

@Serializable object HomeRoute
@Serializable object ProfileRoute

@Composable
fun AppNavHost(
    navController: NavHostController,
    selectedTab: TabItem,
    onTabChange: (TabItem) -> Unit,
    innerPadding: PaddingValues,
    homeScreenContent: @Composable () -> Unit,
    profileScreenContent: @Composable () -> Unit
) {
    NavHost(
        navController = navController,
        startDestination = selectedTab.route,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable<HomeRoute> { homeScreenContent() }
        composable<ProfileRoute> { profileScreenContent() }
    }
}