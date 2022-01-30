package io

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.fazecast.jSerialComm.SerialPort
import kotlinx.coroutines.MainScope

open class ArduinoIO : IO {
    private val scope = MainScope()

    var device: SerialPort? by mutableStateOf(null)

    var availableDevices by mutableStateOf(emptyArray<SerialPort>())
        private set

    override var onMessageReceived: ((Message) -> Unit)? = null

    init {
        availableDevices = SerialPort.getCommPorts()
    }
}