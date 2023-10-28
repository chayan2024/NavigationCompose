package com.withjetpack.navigationcompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
 fun FirstScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "First Screen" ,
            color = Color.Green,
            style = TextStyle(textAlign = TextAlign.Center),
            modifier = Modifier
                .padding(34.dp)
                .clickable(onClick = {
                    // this will navigate to second screen

                })
        )
        Button(onClick = {
            navController.navigate("second_screen")
         }) {
            Text(text = "Click me to go to Second Screen")
        }
    }
}