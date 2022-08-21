package dh.apps.messageforward

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dh.apps.resource.Android_MessageForwardTheme
import dh.apps.resource.RobotoTypography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_MessageForwardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Text(text = "Hello $name!", style = RobotoTypography.displayLarge)
        Text(text = "Hello $name!", style = RobotoTypography.displayMedium)
        Text(text = "Hello $name!", style = RobotoTypography.displaySmall)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Hello $name!", style = RobotoTypography.headlineLarge)
        Text(text = "Hello $name!", style = RobotoTypography.headlineMedium)
        Text(text = "Hello $name!", style = RobotoTypography.headlineSmall)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Hello $name!", style = RobotoTypography.titleLarge)
        Text(text = "Hello $name!", style = RobotoTypography.titleMedium)
        Text(text = "Hello $name!", style = RobotoTypography.titleSmall)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Hello $name!", style = RobotoTypography.labelLarge)
        Text(text = "Hello $name!", style = RobotoTypography.labelMedium)
        Text(text = "Hello $name!", style = RobotoTypography.labelSmall)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Hello $name!", style = RobotoTypography.bodyLarge)
        Text(text = "Hello $name!", style = RobotoTypography.bodyMedium)
        Text(text = "Hello $name!", style = RobotoTypography.bodySmall)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Android_MessageForwardTheme {
        Greeting("Android")
    }
}