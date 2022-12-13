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
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Elige una de las opciones")
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Tests")
        }

    }
    Column (

            ){

    }
}