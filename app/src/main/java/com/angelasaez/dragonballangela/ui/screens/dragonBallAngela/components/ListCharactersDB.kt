package com.angelasaez.dragonballangela.ui.screens.dragonBallAngela.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelasaez.dragonballangela.R
import com.angelasaez.dragonballangela.model.DragonBallCharacter

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ListCharactersDB(onCharacterSelected: (DragonBallCharacter) -> Unit,  selectedCharacter: DragonBallCharacter?) {

    LazyColumn {

        val groupedDBCharacters: Map<Char, List<DragonBallCharacter>> =
            DragonBallCharacter.sorted().groupBy { it.spanishName.first() }

        groupedDBCharacters.forEach { (header, names) ->
            stickyHeader {
                Box(
                    modifier = Modifier.fillMaxWidth()
                        .background(colorResource(id = R.color.box_header_color))
                        .padding(vertical = 6.dp)
                ) {
                    Text(
                        "$header",
                        modifier = Modifier.align(Alignment.Center).padding(horizontal = 16.dp),
                        color = colorResource(id = R.color.white),
                        fontSize = 22.sp,
                        fontWeight = Bold

                    )
                }
                HorizontalDivider()
            }

            items(names) { character ->

                ListItem(
                    headlineContent = {
                        Text(
                            text = character.spanishName,
                            fontSize = 18.sp,
                            color = colorResource(id = R.color.text_character_color),
                            fontWeight = Bold
                        )
                    },
                    trailingContent = {
                        // icono para seleccionar
                        if (selectedCharacter == character) {
                            Icon(
                                painter = painterResource(id = R.drawable.dragon_ball_vector),
                                contentDescription = "Seleccionado",
                                tint = Color.Unspecified,
                                modifier = Modifier
                                    .size(20.dp),
                            )
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                        .background(
                            if (selectedCharacter == character) colorResource(id = R.color.selected_character_color).copy(alpha = 0.6f)
                            else Color.Transparent
                        )
                        .padding(vertical = 15.dp, horizontal = 30.dp)
                        .border(1.dp, colorResource(id = R.color.black))
                        .clickable { onCharacterSelected(character) }
                )
            }
        }
    }
}