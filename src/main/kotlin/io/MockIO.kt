package io

import kotlinx.coroutines.*
import model.WaterLevel

class MockIO: ArduinoIO() {
    private val scope = MainScope()

    init {
        val subjects = listOf("cleanWaterBarrel", "dirtyWaterBarrel")
        scope.launch(Dispatchers.Default) {
            while(true) {
                for(sub in subjects) {
                    val wl = WaterLevel.values().random()
                    onMessageReceived?.invoke(Message(sub, wl))
                }
                delay(1000)

            }
        }
    }

    fun destroy() {
        scope.cancel()
    }
}