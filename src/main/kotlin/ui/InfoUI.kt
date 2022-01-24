package ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.Model

@Preview
@Composable
fun InfoUI(model: Model) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        BarrelInfoUI("Tiszta vizes hordó", model.cleanWaterBarrel)
        Spacer(modifier = Modifier.height(10.dp))
        BarrelInfoUI("Szennyvizes hordó", model.dirtyWaterBarrel)

    }
}