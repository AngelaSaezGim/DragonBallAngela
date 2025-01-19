package com.angelasaez.dragonballangela.ui.screens.dragonBallAngela.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.angelasaez.dragonballangela.R
import com.angelasaez.dragonballangela.model.DragonBallCharacter
import com.angelasaez.dragonballangela.ui.screens.common.CustomSpacer


@Composable
fun InfoCharacter(selectedCharacter: DragonBallCharacter?) {

    var showDescription by remember { mutableStateOf(false) }

    val red = colorResource(id = R.color.red)
    val black = colorResource(id = R.color.black)

    if (selectedCharacter != null) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
        ) {
            Box( //uso box para gestionar los tamaños
                modifier = Modifier.fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .padding(bottom = 0.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = stringResource(
                            R.string.name_character,
                            selectedCharacter.spanishName,
                            selectedCharacter.japaneseName
                        ),
                        fontSize = 16.sp,
                        fontWeight = Bold,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Text(
                        text = stringResource(
                            R.string.alias_character,
                            selectedCharacter.otherName.ifEmpty { "Sin alias asignado" }),
                        fontSize = 14.sp,
                        color = if (selectedCharacter.otherName.isEmpty()) red else black,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Text(
                        text = stringResource(R.string.gender_character, selectedCharacter.gender),
                        fontSize = 14.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Text(
                        text = stringResource(R.string.species_character, selectedCharacter.species),
                        fontSize = 14.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Text(
                        text = stringResource(
                            R.string.birth_character,
                            if (selectedCharacter.birthdayYear == 0) "Desconocido" else selectedCharacter.birthdayYear
                        ),
                        color = if (selectedCharacter.birthdayYear == 0) red else black,
                        fontSize = 14.sp
                    )

                    CustomSpacer(10)

                    Button(
                        onClick = { showDescription = true },
                        shape = RoundedCornerShape(20.dp),
                        modifier = Modifier
                            .size(400.dp)
                            .padding(top = 8.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.second_color_theme))
                    ) {
                        Text(stringResource(R.string.know_more_character), color = colorResource(id = R.color.white))
                    }
                }

                AsyncImage(
                    model = selectedCharacter.photo,
                    contentDescription = "${selectedCharacter.spanishName} Image",
                    modifier = Modifier
                        .size(180.dp)
                        .align(Alignment.TopEnd)
                        .padding(12.dp)
                        .border(1.dp, colorResource(id = R.color.black))
                        .background(colorResource(id = R.color.second_color_theme))
                )


                if (showDescription) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color(0xAA000000)), // sensacion transparencia
                        contentAlignment = Alignment.Center
                    ) {
                        Card(
                            shape = RoundedCornerShape(12.dp),
                            elevation = CardDefaults.cardElevation(8.dp),
                            modifier = Modifier
                                .fillMaxWidth(0.9f)
                                .wrapContentSize()
                        ) {
                            Column(
                                modifier = Modifier
                                    .padding(20.dp)
                                    .fillMaxWidth()
                                    // SE PUEDE HACER SCROLL
                                    .verticalScroll(rememberScrollState())
                            ) {
                                IconButton(
                                    onClick = { showDescription=false },
                                    modifier = Modifier
                                        .size(30.dp)
                                        .align(Alignment.End)
                                        .wrapContentSize()
                                ) {
                                    Box(
                                        modifier = Modifier.background(Color(0xFFEA4E4E))
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Close,
                                            contentDescription = "Cerrar",
                                            tint = colorResource(id = R.color.white)
                                        )
                                    }
                                }
                                Text(
                                    text = stringResource(R.string.description_character),
                                    fontWeight = Bold,
                                    fontSize = 18.sp,
                                    modifier = Modifier.padding(bottom = 8.dp)
                                )
                                Text(
                                    text = selectedCharacter.information,
                                    fontSize = 12.sp,
                                    modifier = Modifier.padding(bottom = 16.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}