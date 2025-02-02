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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelasaez.dragonballangela.R

@Composable
fun AuthorInfo(onClose: () -> Unit) {
    Box(
        modifier = Modifier
            .wrapContentSize() //ocupa el espacio necesario
            .padding(8.dp)
            .background(colorResource(id = R.color.firs_color_theme), RoundedCornerShape(20.dp))
            .border(1.dp, colorResource(id = R.color.black), RoundedCornerShape(20.dp))
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
                            .border(1.dp, colorResource(id = R.color.black), CircleShape)
                            .size(70.dp),
                        contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = stringResource(R.string.author_name), fontSize = 15.sp, modifier = Modifier.padding(20.dp)
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