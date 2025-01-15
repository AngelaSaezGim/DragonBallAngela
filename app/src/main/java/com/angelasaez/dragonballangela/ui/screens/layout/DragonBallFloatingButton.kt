package com.angelasaez.dragonballangela.ui.screens.layout

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable

@Composable
fun DragonBallFloatingButton() {
    FloatingActionButton(
        onClick = {}
    ){
        Icon(
            imageVector = Icons.Default.Info,
            contentDescription = "Info autor"
        )
    }
}