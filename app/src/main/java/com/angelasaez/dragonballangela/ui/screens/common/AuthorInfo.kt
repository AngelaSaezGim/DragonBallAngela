package com.angelasaez.dragonballangela.ui.screens.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelasaez.dragonballangela.R

@Composable
fun AuthorInfo(onClose: () -> Unit) {
    Box(
        modifier = Modifier
            .wrapContentSize() //ocupa el espacio necesario
            .padding(10.dp)
            .background(Color.White, shape = RectangleShape)
            // Añadir sombra para profundidad
    ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column(
                    modifier = Modifier
                        .size(90.dp)
                        .padding(10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.foto_perfil),
                        contentDescription = "Imagen autor",
                        modifier = Modifier
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape)
                            .size(70.dp),
                        contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = "Ángela", fontSize = 15.sp, modifier = Modifier.padding(20.dp)
                )
                CustomSpacer(width = 30)
            }
            //Boton para cerrar el box
            IconButton(
                onClick = { onClose() },
                modifier = Modifier.align(Alignment.TopEnd)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Cerrar",
                )
            }
        }
}