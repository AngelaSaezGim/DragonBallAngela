package com.angelasaez.dragonballangela.ui.screens.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelasaez.dragonballangela.R

@Composable
fun AuthorInfo() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
            .shadow(2.dp, RectangleShape, true, Color.Black),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(
            modifier = Modifier
                .size(90.dp)
                .padding(15.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.foto_perfil),
                contentDescription = "Imagen autor",
                modifier = Modifier.clip(CircleShape).border(1.dp, Color.Black, CircleShape)
                    .size(70.dp),
                contentScale = ContentScale.Crop
            )
        }

        CustomSpacer(width = 10);

        Column(
            modifier = Modifier
                .padding(15.dp),
        ) {
            Text(
                text = "Ángela", fontSize = 15.sp
            )
        }

    }
}