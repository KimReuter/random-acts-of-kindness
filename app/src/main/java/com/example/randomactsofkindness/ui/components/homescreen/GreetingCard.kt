package com.example.randomactsofkindness.ui.components.homescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.randomactsofkindness.ui.components.GlassMorphismCard

@Composable
fun GreetingCard() {
    GlassMorphismCard(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth(),
        blurRadius = 32.dp
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Hey Kim 🌞",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Bereit für eine gute Tat?",
                fontSize = 18.sp,
                color = Color.White.copy(alpha = 0.9f),
                fontFamily = FontFamily.SansSerif
            )
        }
    }
}

