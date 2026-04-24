package com.example.myapplication.CardViews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MediumCardVeiw(
    innerBody : @Composable () -> Unit
) {
    Column(
        modifier = Modifier
            .height(250.dp)
            .fillMaxWidth()
            .padding(12.dp)
            .shadow(
                elevation = 10.dp
            )
            .background(Color.White, shape = RoundedCornerShape(10.dp))
        ,
//        content = {}

    ) {
        innerBody()
    }
}