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
import com.example.myapplication4.R
import com.example.myapplication4.navigation.AppScreens

@Composable
fun FirstScreen(navController: NavController) {
    Scaffold( ) {
        BodyContent(navController)
    }
}

var usuario: String = "a"
var contrasenia: String = "p"
var senialar = false


@Composable
fun BodyContent(navController: NavController){

    var user by remember { mutableStateOf("") }
    var pass by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .paint(
                painter = painterResource(id = R.drawable.fondo1),
                contentScale = ContentScale.FillBounds
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.size(50.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (registrado){
                popupR()
            }else{
                registrado = false
            }
        }
        Row(
            modifier = Modifier
                .background(Color.Gray)
                .padding(16.dp)
        ) {
            Text(
                text = "DUOPROGRAMACION"
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))
        Column( modifier = Modifier
            .background(Color.Gray)
            .padding(20.dp)) {
            Text("Usuario")
            TextField(value = user, onValueChange = { user = it },  placeholder = { Text("Enter User") } )

            Text("Contraseña")
            TextField(value = pass, onValueChange = { pass = it},  placeholder = { Text("Enter Pass") })
        }
        Column(
            modifier = Modifier.size(50.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (senialar){
                popup()

            }else{
                senialar = false
            }
        }
        Row() {
            Button(
                onClick = {
                    senialar = false
                    registrado = false
                    if(user == usuario && pass == contrasenia){
                        navController.navigate(route = AppScreens.SecondScreen.route)
                    }else if (user !== usuario && pass !== contrasenia){
                        senialar = true
                    }
                }
            ) {
                Text("Login")
            }
            Spacer(modifier = Modifier.padding(15.dp))
            Button(
                onClick = {
                    senialar = false
                    registrado = false
                    navController.navigate(route = AppScreens.Registration.route)
                }
            ) {
                Text("Registrarse")
            }
        }
    }
}
@Composable
fun popup(){
    Column() {
        Popup(
            properties = PopupProperties(),
            alignment = Alignment.Center,
        ){
            Text(text = "Usuario y contraseña incorrectos", modifier = Modifier
                .background(Color.White)
                .padding(16.dp),
                color = Color.Gray
            )
        }
    }
}
@Composable
fun popupR(){
    Column() {
        Popup(
            properties = PopupProperties(),
            alignment = Alignment.Center,
        ){
            Text(text = "Usuario registrado", modifier = Modifier
                .background(Color.White)
                .padding(16.dp),
                color = Color.Gray
            )
        }
    }
}