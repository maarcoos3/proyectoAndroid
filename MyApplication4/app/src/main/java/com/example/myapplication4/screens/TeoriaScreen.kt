package com.example.myapplication4.screens

import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication4.navigation.AppScreens

@Composable
fun TeoriaScreen(navController: NavController) {
    Scaffold {
        TeoriaBodyContent(navController)
    }
}

@Composable
fun TeoriaBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .height(750.dp)
                .fillMaxWidth()
                .background(Color.Green)
                .padding(horizontal = 50.dp, vertical = 20.dp)
            ,
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                verticalArrangement = Arrangement.Top,
            ) {
                Box(modifier = Modifier
                    .padding(horizontal = 5.dp, vertical = 2.dp)
                    .border(width = 1.dp, color = Color.Black)
                    .fillMaxWidth()
                ) {
                    Text(text = "Bienvenido a la teoria de los retos, aqui podras consultar tus dudas sobre las preguntas que encontraras.")
                }
                Box(modifier = Modifier
                    .padding(horizontal = 5.dp, vertical = 2.dp)
                    .border(width = 1.dp, color = Color.Black)
                    .fillMaxWidth()
                ) {
                    Row( ) {
                       Text(text = "Hola")
                        Spacer(modifier = Modifier.padding(20.dp))
                       Text(text = "Carlos")
                    }
                }
                Box(modifier = Modifier
                    .padding(horizontal = 5.dp, vertical = 2.dp)
                    .border(width = 1.dp, color = Color.Black)
                ) {

                    Text(text = "Bienvenido a la teoria de los retos,que encontraras.")
                }
                Box(modifier = Modifier
                    .padding(horizontal = 5.dp)
                    .border(width = 1.dp, color = Color.Black)
                    .fillMaxWidth()

                ) {

                    Text(text = "Bienvenido a la teoria de los retoss.")
                }
            }
        }

        Column(
            Modifier
                .height(100.dp)
                .fillMaxWidth()
                .background(Color.Blue)
                .height(70.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {
                navController.popBackStack()
            }) {
                Text("Tests")
            }

        }
    }
}