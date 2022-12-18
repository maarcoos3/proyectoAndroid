package com.example.myapplication4.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import androidx.navigation.NavController
import com.example.myapplication4.navigation.AppScreens

@Composable
fun Registration(navController: NavController) {
    Scaffold {
        RegistrationContent(navController)
    }
}

var registrado = false

@Composable
fun RegistrationContent(navController: NavController) {

    var nUser by remember { mutableStateOf("") }
    var npass by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .background(Color.Gray)
                .padding(16.dp)
        ) {
            Text(
                text = "Registro"
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))
        Column( modifier = Modifier
            .background(Color.Gray)
            .padding(20.dp)) {
            Text("Usuario")
            TextField(value = nUser, onValueChange = { nUser = it },  placeholder = { Text("Enter User") } )

            Text("Contraseña")
            TextField(value = npass, onValueChange = { npass = it},  placeholder = { Text("Enter Pass") })
        }

        Row() {
            Button(
                onClick = {
                    navController.navigate(route = AppScreens.FirstScreen.route)
                }
            ) {
                Text("Login")
            }
            Spacer(modifier = Modifier.padding(15.dp))
            Button(
                onClick = {
                    usuario = nUser
                    contrasenia = npass
                    registrado = true
                    navController.navigate(route = AppScreens.FirstScreen.route)
                }
            ) {
                Text("Registrarse")
            }
        }
    }

}