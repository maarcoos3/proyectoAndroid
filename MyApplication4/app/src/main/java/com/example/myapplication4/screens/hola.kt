package com.example.myapplication4.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.myapplication4.R
import com.example.myapplication4.navigation.AppScreens

@Composable
fun FirstScreen(navController: NavController) {
    Scaffold( ) {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController){
    //val imagen = painterResource(R.drawable.quizz)

    var imagenLoguin = painterResource(R.drawable.quizzz)

    var user by remember { mutableStateOf("usuario") }
    var pass by remember { mutableStateOf("usuario") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

       Column( modifier = Modifier) {
           Text("Usuario")
           TextField(value = user, onValueChange = { user = it } )

           Text("Contraseña")
           TextField(value = pass, onValueChange = { pass = it} )
       }
        Button(
            onClick = {
                if(user == pass){
                    navController.navigate(route = AppScreens.SecondScreen.route)
                }
            }
        ) {
                Text("Login")
        }
        //Image(painter = imagenLoguin, contentDescription = "sadas")
    }
}

