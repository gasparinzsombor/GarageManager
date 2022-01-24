package io

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.fazecast.jSerialComm.SerialPort

class ArduinoIO {
    var port: SerialPort? by mutableStateOf(null)
        private set

    var availablePorts by mutableStateOf(emptyArray<SerialPort>())
        private set

    var onMessageReceived: ((Message) -> Unit)? = null

    init {
        availablePorts = SerialPort.getCommPorts()
    }

}