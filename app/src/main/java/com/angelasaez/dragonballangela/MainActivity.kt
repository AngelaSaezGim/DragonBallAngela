package com.angelasaez.dragonballangela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.angelasaez.dragonballangela.ui.DragonBallAngelaContent
import com.angelasaez.dragonballangela.ui.screens.dragonBallAngela.DragonBallAngela

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DragonBallAngelaContent {
                DragonBallAngela()
                }
            }
        }
    }
