package ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
@Preview
fun AppBar() {
    TopAppBar(
        title = {
            Text("Garázs")
        }
    )
}