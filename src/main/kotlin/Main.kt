// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.MockIO
import model.Model
import ui.App
import viewmodel.MainViewModel

fun main() {

    val io = MockIO()
    val model = Model(io)
    val viewModel = MainViewModel(model)

    application {

        Window(
            onCloseRequest = ::exitApplication,
            title = "Garázs"
        ) {
            App(model)
        }
    }
}
