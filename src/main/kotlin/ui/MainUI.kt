package ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import model.Model
import viewmodel.MainViewModel

@Composable
@Preview
fun MainUI(model: Model) {
    val viewModel by remember { mutableStateOf(MainViewModel(model)) }

    Scaffold(
        topBar = { AppBar() },
        content = { padding -> ContentUI(viewModel, padding) },
        bottomBar = { BottomBarUI(model.io) }
    )
}