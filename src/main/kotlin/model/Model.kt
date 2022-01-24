package model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import io.ArduinoIO
import util.LCE

class Model {
    var state: LCE by mutableStateOf( LCE.Content )
    val cleanWaterBarrel = Barrel()
    val dirtyWaterBarrel = Barrel()
    val io = ArduinoIO()
}