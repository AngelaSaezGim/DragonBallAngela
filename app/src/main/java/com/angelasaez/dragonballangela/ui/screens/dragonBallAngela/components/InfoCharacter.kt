package com.angelasaez.dragonballangela.ui.screens.dragonBallAngela.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.angelasaez.dragonballangela.model.DragonBallCharacter
import com.angelasaez.dragonballangela.ui.screens.common.CustomSpacer


@Composable
fun InfoCharacter(selectedCharacter: DragonBallCharacter?) {

    var showDescription by remember { mutableStateOf(false) }

    if (selectedCharacter != null) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
        ) {
            Box( //uso box para gestionar los tamaños
                modifier = Modifier.fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Nombre: ${selectedCharacter.spanishName} ( ${selectedCharacter.japaneseName})",
                        fontSize = 16.sp,
                        fontWeight = Bold,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Text(
                        text = "Alias: ${selectedCharacter.otherName}",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Text(
                        text = "Género: ${selectedCharacter.gender}",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Text(
                        text = "Especie: ${selectedCharacter.species}",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Text(
                        text = "Año de nacimiento: ${selectedCharacter.birthdayYear}",
                        fontSize = 14.sp
                    )

                    CustomSpacer(5)

                    Button(onClick = { showDescription = true }) {
                        Text("Saber Más")
                    }
                }

                AsyncImage(
                    model = selectedCharacter.photo,
                    contentDescription = "${selectedCharacter.spanishName} Image",
                    modifier = Modifier
                        .size(180.dp)
                        .align(Alignment.TopEnd)
                        .padding(12.dp)
                        .border(1.dp, Color.Black)
                        .background(Color(0xFFEA4E4E))
                )


                if (showDescription) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color(0xAA000000)), // Fondo semitransparente
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
                                    .padding(16.dp)
                                    .fillMaxWidth()
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
                                            tint = Color.White
                                        )
                                    }
                                }
                                Text(
                                    text = "Descripción",
                                    fontWeight = Bold,
                                    fontSize = 18.sp,
                                    modifier = Modifier.padding(bottom = 8.dp)
                                )
                                Text(
                                    text = selectedCharacter.information,
                                    fontSize = 12.sp,
                                    color = Color.Gray,
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