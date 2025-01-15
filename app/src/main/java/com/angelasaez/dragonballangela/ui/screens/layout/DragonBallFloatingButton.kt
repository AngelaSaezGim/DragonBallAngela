package com.angelasaez.dragonballangela.ui.screens.layout

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.angelasaez.dragonballangela.ui.screens.common.AuthorInfo

@Composable
fun DragonBallFloatingButton() {
    val isAuthorInfoVisible = remember { mutableStateOf(false) }

    FloatingActionButton(
        onClick = {
            isAuthorInfoVisible.value = !isAuthorInfoVisible.value
        }, modifier = Modifier
            .padding(10.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Info, contentDescription = "Info autor"
        )
    }
    //si le damos, sacamos el box
    if (isAuthorInfoVisible.value) {
        AuthorInfo(onClose = { isAuthorInfoVisible.value = false },
        )
    }
}