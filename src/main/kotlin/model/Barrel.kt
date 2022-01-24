package model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class Barrel {
    var level by mutableStateOf( WaterLevel.Normal )
    var isInteriorPumpEnabled by mutableStateOf( true )
}