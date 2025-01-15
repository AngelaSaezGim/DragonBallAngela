package com.angelasaez.dragonballangela.ui.screens.dragonBallAngela

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.angelasaez.dragonballangela.ui.screens.layout.DragonBallFloatingButton
import com.angelasaez.dragonballangela.ui.screens.layout.DragonBallTopBar

@Composable
fun DragonBallAngela() {
    Scaffold (
        modifier = Modifier.fillMaxSize(),
        topBar = { DragonBallTopBar() },
        floatingActionButton = { DragonBallFloatingButton() },
        floatingActionButtonPosition = FabPosition.End
        )
    {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFFFFD000),
                            Color(0xFFF11919),
                        )
                    )
                ),
            verticalArrangement = Arrangement.Center,
        ) {
        }
    }
}