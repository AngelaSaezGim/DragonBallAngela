package com.angelasaez.dragonballangela.ui.screens.dragonBallAngela.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelasaez.dragonballangela.R
import com.angelasaez.dragonballangela.ui.screens.common.CustomSpacer

@Composable
fun NoCharacterSelected (modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.dragon),
                contentDescription = "Imagen pantalla inicio",
                modifier = Modifier.size(180.dp)
            )

            CustomSpacer(20)

            Text(
                text = stringResource(R.string.select_character),
                style = TextStyle(
                    fontSize = 30.sp,
                    color = colorResource(id = R.color.white),
                    fontFamily = FontFamily.Cursive,
                    fontWeight = Bold
                )
            )
        }
    }
}