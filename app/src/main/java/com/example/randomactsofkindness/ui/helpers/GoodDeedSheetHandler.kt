package com.example.randomactsofkindness.ui.helpers

import androidx.compose.runtime.Composable
import com.example.randomactsofkindness.data.GoodDeed
import com.example.randomactsofkindness.ui.components.homescreen.GoodDeedDetailSheet

@Composable
fun GoodDeedSheetHandler(
    selectedDeed: GoodDeed?,
    openSheet: Boolean,
    onDismiss: () -> Unit,
    onCheckedChange: (Boolean) -> Unit
) {
    if (openSheet && selectedDeed != null) {
        GoodDeedDetailSheet(
            goodDeed = selectedDeed,
            onDismiss = onDismiss,
            onCheckedChange = onCheckedChange
        )
    }
}