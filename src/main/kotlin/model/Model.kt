package model

import io.IO
import io.Message

class Model(val io: IO) {
    val cleanWaterBarrel = Barrel()
    val dirtyWaterBarrel = Barrel()

    init {
        io.onMessageReceived = { onMessageReceived(it) }
    }

    private fun onMessageReceived(message: Message) {
        if(message.subject == "cleanWaterBarrel") {
            cleanWaterBarrel.level = message.content
        }
        else {
            dirtyWaterBarrel.level = message.content
        }
    }
}