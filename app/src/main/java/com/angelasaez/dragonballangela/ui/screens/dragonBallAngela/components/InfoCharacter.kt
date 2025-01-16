package com.angelasaez.dragonballangela.ui.screens.dragonBallAngela.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.angelasaez.dragonballangela.model.DragonBallCharacter


@Composable
fun InfoCharacter(selectedCharacter: DragonBallCharacter?) {


    if (selectedCharacter != null) {
        Text(text = "Nombre: ${selectedCharacter.spanishName}")
    }

}