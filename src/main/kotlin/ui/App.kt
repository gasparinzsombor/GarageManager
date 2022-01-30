package ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import model.Model

@Composable
@Preview
fun App(model: Model) {
    MaterialTheme {
        MainUI(model)
    }
}

