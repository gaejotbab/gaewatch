package io.gaejotbab.gaewatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.iu),
                        contentDescription = "배경 화면",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop,
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(paddingValues),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "00:00:00.000", color = Color.White, fontSize = 48.sp)

                        Row {
                            Button(onClick = {}) {
                                Text(text = "초기화")
                            }

                            Spacer(modifier = Modifier.width(16.dp))

                            Button(onClick = {}) {
                                Text(text = "시작")
                            }
                        }
                    }
                }
            }
        )
    }
}

@Preview
@Composable
fun AppPreview() {
    App()
}
