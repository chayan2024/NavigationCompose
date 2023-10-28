package com.withjetpack.navigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.withjetpack.navigationcompose.ui.theme.NavigationComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationComposeTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "first_screen"
                ) {
                    composable("first_screen") {
                        FirstScreen(navController = navController)
                    }
                    composable("second_screen") {
                        SecondScreen(navController = navController)
                    }
                    composable("third_screen") {
                        ThirdScreen(navController = navController)
                    }
                }
            }
        }
    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NavigationComposeTheme {
        Greeting("Android")
    }
}