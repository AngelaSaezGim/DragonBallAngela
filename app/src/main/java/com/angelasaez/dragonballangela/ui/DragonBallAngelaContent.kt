package com.angelasaez.dragonballangela.ui

import androidx.compose.runtime.Composable
import com.angelasaez.dragonballangela.ui.theme.DragonBallAngelaTheme

@Composable
fun DragonBallAngelaContent(content: @Composable () -> Unit) {
    DragonBallAngelaTheme {
        content()
    }
}