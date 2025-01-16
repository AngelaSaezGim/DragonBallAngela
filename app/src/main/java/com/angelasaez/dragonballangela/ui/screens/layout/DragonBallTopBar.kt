package com.angelasaez.dragonballangela.ui.screens.layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.angelasaez.dragonballangela.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DragonBallTopBar() {
    CenterAlignedTopAppBar(
        navigationIcon = {
            Icon(
                painter = painterResource(id = R.drawable.dragon_ball_vector),
                contentDescription = "Dragon Ball Vector",
                tint = Color.Unspecified,
                modifier = Modifier
                    .size(50.dp),
            )
        },
        title = {
            Image(
                painter = painterResource(id = R.drawable.dragon_ball_z_logo),
                contentDescription = "logo dragon ball",
                modifier = Modifier
                    .size(200.dp),
            )
        },
        actions = {
            Text(text = "Akira Toriyama", modifier = Modifier.padding(20.dp,0.dp) )
        }
    )

}
