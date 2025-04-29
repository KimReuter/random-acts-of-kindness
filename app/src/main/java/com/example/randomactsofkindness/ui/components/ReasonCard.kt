package com.example.randomactsofkindness.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.randomactsofkindness.data.reasons
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight


@Composable
fun ReasonCard() {

    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.75f)),
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Dein Grund, Gutes zu tun ♥️",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = Color.DarkGray,
                fontFamily = FontFamily.SansSerif
            )

            Spacer(modifier = Modifier.height(12.dp))

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp),
                color = Color.LightGray.copy(alpha = 0.6f)
            )

            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = reasons.random().text,
                fontSize = 20.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Medium,
                lineHeight = 28.sp,
                color = Color.Gray
            )
        }
    }
}
