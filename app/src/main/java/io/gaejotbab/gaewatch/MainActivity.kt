package io.gaejotbab.gaewatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.gaejotbab.gaewatch.ui.theme.GaewatchTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    GaewatchTheme {
        Scaffold(
            topBar = {
                TopAppBar(title = { Text(text = "개워치") })
            },
            content = { paddingValues ->
            }
        )
    }
}

@Preview
@Composable
fun AppPreview() {
    App()
}
