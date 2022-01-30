package viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import model.Model
import util.LCE

class MainViewModel(val model: Model) {
    var state: LCE by mutableStateOf( LCE.Content )



}