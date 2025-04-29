package com.example.randomactsofkindness.data


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.randomactsofkindness.ui.components.HomeRoute
import com.example.randomactsofkindness.ui.components.ProfileRoute

enum class TabItem(
    val route: Any,
    val tabIcon: ImageVector
) {
    Home(HomeRoute, Icons.Default.Home),
    Profile(ProfileRoute, Icons.Default.Person)
}