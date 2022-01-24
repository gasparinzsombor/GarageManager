package ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import model.Barrel
import model.WaterLevel

@Preview
@Composable
fun BarrelInfoUI(barrelName: String, barrel: Barrel) {

    Card(elevation = 2.dp) {
        Column(modifier = Modifier.padding(30.dp)) {
            Text(barrelName, fontSize = 1.5.em)

            Spacer(modifier = Modifier.size(10.dp))

            Row {
                Text("Vizszint: ")

                when(barrel.level) {
                    WaterLevel.Normal -> Text("Normál", color = Color.Green)
                    WaterLevel.High -> Text("Magas", color = Color.Red)
                    WaterLevel.Low -> Text("Alacsony", color = Color.Red)
                }
            }

            Spacer(modifier = Modifier.size(10.dp))

            Row {
                Text("Belső szívattyú engedélyezve: ")

                if(barrel.isInteriorPumpEnabled) {
                    Text("Igen", color = Color.Green)
                } else {
                    Text("Nem", color = Color.Red)
                }
            }


        }
    }
}