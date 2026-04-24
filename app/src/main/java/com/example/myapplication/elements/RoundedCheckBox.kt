package com.example.myapplication.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RoundedCheckBox(isChecked: Boolean) {
    Box(
        modifier = Modifier
            .size(24.dp)
            .background(
                color = if(isChecked) Color.Blue
                else Color.Transparent,
                shape = CircleShape
            )
            .border(2.dp, Color.Gray, shape = CircleShape)
        ,
        contentAlignment = Alignment.Center
    ){
        if(isChecked)Icon(
            Icons.Default.Check
            , contentDescription = "",
            tint = Color.White
        )
    }
}