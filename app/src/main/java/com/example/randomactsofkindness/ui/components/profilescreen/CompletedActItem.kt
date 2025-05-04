package com.example.randomactsofkindness.ui.components.profilescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.randomactsofkindness.data.GoodDeed
import com.example.randomactsofkindness.ui.components.GlassMorphismCard

@Composable
fun CompletedActItem(act: GoodDeed) {
    GlassMorphismCard (
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(act.title, fontWeight = FontWeight.Medium, color = Color.White)
            act.description?.let {
                Spacer(modifier = Modifier.height(4.dp))
                Text(it, fontSize = 14.sp, color = Color.White)
            }
        }
    }
}