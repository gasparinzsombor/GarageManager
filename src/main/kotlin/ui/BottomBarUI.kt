package ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.ArduinoIO

@Preview
@Composable
fun BottomBarUI(io: ArduinoIO) {
    var dropDownExpanded by remember { mutableStateOf(false) }

    BottomAppBar(
        backgroundColor = Color.LightGray,
    ) {
        Box(
            modifier = Modifier.padding(start = 10.dp),
        ) {

            //ClickableText(AnnotatedString(io.port?.descriptivePortName ?: "No device Connected"), onClick = { dropDownExpanded = !dropDownExpanded })


            TextButton(onClick = { dropDownExpanded = !dropDownExpanded }) {
                Text(io.port?.descriptivePortName ?: "Nincs eszköz csatlakoztatva")
            }

            DropdownMenu(
                expanded = dropDownExpanded,
                onDismissRequest = { dropDownExpanded = false }
            ) {

                for(port in io.availablePorts) {
                    DropdownMenuItem(onClick = {  dropDownExpanded = false}) {
                        Text(port.descriptivePortName)
                    }
                }

            }
        }

    }
}