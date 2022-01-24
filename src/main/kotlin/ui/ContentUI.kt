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
import model.Model
import util.LCE

@Composable
@Preview
fun ContentUI(model: Model, padding: PaddingValues) {
    Box(modifier = Modifier.fillMaxSize().padding(10.dp), contentAlignment = Alignment.TopCenter) {
        when(model.state) {
            LCE.Loading -> LoadingUI()
            LCE.Content -> InfoUI(model)
            is LCE.Error<*> -> ErrorUI(model)
        }
    }
}