package ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import model.Model

@Composable
@Preview
fun MainUI() {
    val model = remember { Model() }

    Scaffold(
        topBar = { AppBar() },
        content = { padding -> ContentUI(model, padding) },
        bottomBar = { BottomBarUI(model.io) }
    )
}