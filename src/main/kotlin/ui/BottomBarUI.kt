package ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import io.ArduinoIO
import io.IO

@Preview
@Composable
fun BottomBarUI(io: IO) {

    BottomAppBar(
        backgroundColor = Color.LightGray,
    ) {

        if(io is ArduinoIO) {
            ComChooserMenuUI(io)
        }

    }
}