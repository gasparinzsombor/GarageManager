package ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.ArduinoIO

@Composable
fun ComChooserMenuUI(io: ArduinoIO) {
    var dropDownExpanded by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.padding(start = 10.dp),
    ) {


        TextButton(onClick = { dropDownExpanded = !dropDownExpanded }) {
            Text(io.device?.descriptivePortName ?: "Nincs eszköz csatlakoztatva")
        }

        DropdownMenu(
            expanded = dropDownExpanded,
            onDismissRequest = { dropDownExpanded = false }
        ) {

            for(port in io.availableDevices) {
                DropdownMenuItem(onClick = {  dropDownExpanded = false; io.device = port}) {
                    Text(port.descriptivePortName)
                }
            }

            DropdownMenuItem(onClick = {}) {
                Text("alma")
            }

        }
    }
}