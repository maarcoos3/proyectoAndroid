package com.example.myapplication4.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .height(700.dp)
                .fillMaxWidth()
                .background(Color.Gray),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            
            Spacer(modifier = Modifier.padding(40.dp))
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.DarkGray,
                    contentColor = Color(0xFFFFE500)
                ),
                onClick = {
                    navController.navigate(route = AppScreens.Prueba1.route)
                }, shape = RoundedCornerShape(50)) {
                    Text("Prueba 1")
                }
        }

        Column(
            Modifier
                .height(100.dp)
                .fillMaxWidth()
                .background(Color.LightGray)
                .height(70.dp),
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

