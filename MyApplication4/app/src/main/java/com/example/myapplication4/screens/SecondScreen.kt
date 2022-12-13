package com.example.myapplication4.screens

import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
        Text("Elige una de las opciones")
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Tests")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens.TeoriaScreen.route)
        }) {
            Text("Teoria")
        }
    }
}

