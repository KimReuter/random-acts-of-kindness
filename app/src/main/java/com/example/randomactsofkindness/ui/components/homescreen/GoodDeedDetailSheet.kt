package com.example.randomactsofkindness.ui.components.homescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.randomactsofkindness.data.GoodDeed
import com.example.randomactsofkindness.ui.components.profilescreen.InfoRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GoodDeedDetailSheet(
    modifier: Modifier = Modifier,
    goodDeed: GoodDeed,
    onDismiss: () -> Unit,
    onCheckedChange: (Boolean) -> Unit
) {
    var isChecked by remember { mutableStateOf(goodDeed.done) }

    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true,
        confirmValueChange = { true }
    )

    LaunchedEffect(Unit) {
        sheetState.expand()
    }

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = sheetState
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 24.dp, vertical = 16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = goodDeed.title,
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(text = goodDeed.description)

            Spacer(modifier = Modifier.height(24.dp))

            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                InfoRow(emoji = "⭐️", label = "Schwierigkeit: ${goodDeed.difficulty.label}")
                InfoRow(emoji = "💰", label = "Kosten: ${goodDeed.requiredMoney.label}")
                InfoRow(emoji = "⏳", label = "Zeitaufwand: ${goodDeed.timeRequired.label}")
                InfoRow(emoji = "👥", label = "Sozial: ${goodDeed.socialInteraction.label}")
            }

            Spacer(modifier = Modifier.height(24.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Erledigt?")
                Checkbox(
                    checked = isChecked,
                    onCheckedChange = { checked ->
                        isChecked = checked
                        onCheckedChange(checked)
                    }
                )
            }
        }
    }
}