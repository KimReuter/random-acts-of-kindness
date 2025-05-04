package com.example.randomactsofkindness.ui.helpers

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
    HOME(HomeRoute, Icons.Default.Home),
    PROFILE(ProfileRoute, Icons.Default.Person)
}