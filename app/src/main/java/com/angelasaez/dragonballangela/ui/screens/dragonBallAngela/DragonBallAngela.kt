package com.angelasaez.dragonballangela.ui.screens.dragonBallAngela

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.angelasaez.dragonballangela.model.DragonBallCharacter
import com.angelasaez.dragonballangela.ui.screens.dragonBallAngela.components.InfoCharacter
import com.angelasaez.dragonballangela.ui.screens.dragonBallAngela.components.ListCharactersDB
import com.angelasaez.dragonballangela.ui.screens.dragonBallAngela.components.NoCharacterSelected
import com.angelasaez.dragonballangela.ui.screens.layout.DragonBallFloatingButton
import com.angelasaez.dragonballangela.ui.screens.layout.DragonBallTopBar

@Composable
fun DragonBallAngela() {

    val selectedCharacter = remember { mutableStateOf<DragonBallCharacter?>(null) }

    Scaffold (
        modifier = Modifier.fillMaxSize(),
        topBar = { DragonBallTopBar() },
        floatingActionButton = { DragonBallFloatingButton() },
        floatingActionButtonPosition = FabPosition.End
        )
    {
        Row( // 1 fila - 2 columnas
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
        ) {
            // Columna lista
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.2f)
                    .border(1.dp, Color.Black)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFFEA4E4E),
                                Color(0xFFF11919)
                            )
                        )
                    ),
                verticalArrangement = Arrangement.Center
            ) {
                ListCharactersDB(
                    onCharacterSelected = { character ->
                        selectedCharacter.value = character
                    },
                    selectedCharacter = selectedCharacter.value
                )
            }

            // Columna info
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.5f)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFFEA4E4E),
                                Color(0xFFF11919)
                            )
                        )
                    )
            ) {
                if (selectedCharacter.value == null) {
                    // Pantalla de inicio
                    NoCharacterSelected()
                } else {
                    // BOTON PARA CERRAR CHARACTER SELECCIONADO Y VOVLVER A INICIO
                    IconButton(
                        onClick = { selectedCharacter.value = null },
                        modifier = Modifier
                            .padding(16.dp)
                            .align(Alignment.End)
                            .size(30.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Cerrar"
                        )
                    }
                    InfoCharacter(selectedCharacter = selectedCharacter.value)
                }
            }
        }
    }
}