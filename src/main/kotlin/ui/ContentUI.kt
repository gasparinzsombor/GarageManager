package ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import util.LCE
import viewmodel.MainViewModel

@Composable
@Preview
fun ContentUI(viewModel: MainViewModel, padding: PaddingValues) {
    val appState = viewModel.state

    Box(modifier = Modifier.fillMaxSize().padding(10.dp), contentAlignment = Alignment.TopCenter) {
        when(appState) {
            LCE.Loading -> LoadingUI()
            LCE.Content -> InfoUI(viewModel)
            is LCE.Error<*> -> ErrorUI(appState.error)
        }
    }
}