package com.example.myapplication4.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication4.navigation.AppScreens

@Composable
fun SecondScreen(navController: NavController) {
    Scaffold {
        SecondBodyContent(navController)
    }
}

@Composable
fun SecondBodyContent(navController: NavController){
    val fondo = Brush.horizontalGradient(listOf(Color(0xFFB2F5EE), Color(0xFF07F1D6)))

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .size(720.dp)
                .fillMaxWidth()
                .background(fondo),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.padding(40.dp))
            Column( modifier = Modifier
                .size(100.dp)
                .alpha(0.5f)
                .background(Color.Blue, CircleShape)
                .border(2.dp, Color.Blue, CircleShape)
                .clickable {
                    navController.navigate(route = AppScreens.Prueba1.route)
                    acertasteP1 = 0
                },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "Prueba 1", color = Color.Cyan )
            }
            Spacer(modifier = Modifier.padding(40.dp))
            Column( modifier = Modifier
                .size(100.dp)
                .alpha(0.5f)
                .background(Color.Blue, CircleShape)
                .border(2.dp, Color.Blue, CircleShape)
                .clickable {
                    navController.navigate(route = AppScreens.Prueba2.route)
                },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "Prueba 2", color = Color.Cyan )
            }
        }

        Column(
            Modifier
                .height(100.dp)
                .fillMaxWidth()
                .background(Color.LightGray)
                .height(70.dp)
                .border(2.dp, Color.Blue)
            ,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Gray,
                    contentColor = Color(0xFFFFEE58)
                ),onClick = {
                    navController.navigate(route = AppScreens.TeoriaScreen.route)
            }) {
                    Text("Teoria")
                }
        }
    }
}

