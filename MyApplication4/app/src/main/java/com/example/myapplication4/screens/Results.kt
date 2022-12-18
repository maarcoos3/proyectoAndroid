package com.example.myapplication4.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication4.R
import com.example.myapplication4.navigation.AppScreens


@Composable
fun Results(navController: NavController) {
    Scaffold {
        ResultsBodyContent(navController)
    }
}
@Composable
fun ResultsBodyContent(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(id = R.drawable.fondo1),
                contentScale = ContentScale.FillBounds
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .size(700.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (corregirP1){
                if (acertasteP1 >= 3){
                    Image(painter = painterResource(id = R.drawable.aprobado), contentDescription = null)
                    Text(text = "Has acertado: $acertasteP1/5 , por ello has aprobado")
                    Text(text = "Has fallado: $fallosP1/5 preguntas")

                }else{
                    Image(painter = painterResource(id = R.drawable.suspensobueno), contentDescription = null)
                    Text(text = "Has acertado: $acertasteP1/5 , por ello has suspendido")
                    Text(text = "Has fallado: $fallosP1 preguntas")
                }
            }
           else if (corregirP2){
                if (acertasteP2 >= 3){
                    Image(painter = painterResource(id = R.drawable.aprobado), contentDescription = null)
                    Text(text = "Has acertado: $acertasteP2/5 , por ello has aprobado")
                    Text(text = "Has fallado: $fallosP2/5 preguntas")

                }else{
                    Image(painter = painterResource(id = R.drawable.suspensobueno), contentDescription = null)
                    Text(text = "Has acertado: $acertasteP2/5 , por ello has suspendido")
                    Text(text = "Has fallado: $fallosP2 preguntas")
                }
            }
        }
        Column(
            Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .size(70.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Gray,
                    contentColor = Color(0xFFFFEE58)
                ),onClick = {
                    corregirP1 = false
                    corregirP2 = false
                    navController.navigate(route = AppScreens.SecondScreen.route)
                }) {
                Text("Pruebas")
            }
        }
    }
}
