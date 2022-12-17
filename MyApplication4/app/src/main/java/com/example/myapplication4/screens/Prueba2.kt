package com.example.myapplication4.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication4.navigation.AppScreens

@Composable
fun Prueba2(navController: NavController) {
    Scaffold {
        Prueba2BodyContent(navController)
    }
}

object listaPreguntas {
    val lista = listOf(
        Pregunta("¿Qué etiqueta se utiliza para los títulos?", respuesta = listOf("h", "p", "a", "br")),
        Pregunta("¿Qué etiqueta se utiliza para los párrafos?", respuesta = listOf("h", "p", "a", "br"))
    )
}

class Pregunta(s: String, respuesta: List<String>) {


}
var acertasteP2 = 0
@Composable
fun Prueba2BodyContent(navController: NavController) {

    val pregunta1 = remember { mutableStateOf("") }
    val pregunta1isSelectedItem: (String) -> Boolean = { pregunta1.value == it }
    val pregunta1onChangeState: (String) -> Unit = { pregunta1.value = it }

    val pregunta2 = remember { mutableStateOf("") }
    val pregunta2isSelectedItem: (String) -> Boolean = { pregunta2.value == it }
    val pregunta2onChangeState: (String) -> Unit = { pregunta2.value = it }

    val pregunta3 = remember { mutableStateOf("") }
    val pregunta3isSelectedItem: (String) -> Boolean = { pregunta3.value == it }
    val pregunta3onChangeState: (String) -> Unit = { pregunta3.value = it }

    val pregunta4 = remember { mutableStateOf("") }
    val pregunta4isSelectedItem: (String) -> Boolean = { pregunta4.value == it }
    val pregunta4onChangeState: (String) -> Unit = { pregunta4.value = it }

    val pregunta5 = remember { mutableStateOf("") }
    val pregunta5isSelectedItem: (String) -> Boolean = { pregunta5.value == it }
    val pregunta5onChangeState: (String) -> Unit = { pregunta5.value = it }

    val pregunta1items = listOf("h", "p", "a", "br")
    val pregunta2items = listOf("h", "p", "a", "br")
    val pregunta3items = listOf("h", "p", "a", "br")
    val pregunta4items = listOf("h", "p", "a", "br")
    val pregunta5items = listOf("POST", "HTTPREQUEST", "GET", "XMLREQUEST")


    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .background(largeRadialGradient)
    ) {
        Box(modifier = Modifier.fillMaxWidth().height(40.dp).background(Color.Gray))


        Box(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color.LightGray)) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // var aciertos by remember { mutableStateOf("0") }
                var fallos by remember { mutableStateOf(0) }

                Button(
                    onClick = {
                        if(pregunta1.value == "h"){
                            acertasteP2 += 1
                        }else{
                            fallos += 1
                        }
                        if(pregunta2.value == "p"){
                            acertasteP2 += 1
                        }else{
                            fallos += 1
                        }
                        if(pregunta3.value == "a"){
                            acertasteP2 += 1
                        }else{
                            fallos += 1
                        }
                        if(pregunta4.value == "br"){
                            acertasteP2 += 1
                        }else{
                            fallos += 1
                        }
                        if(pregunta5.value == "GET"){
                            acertasteP2 += 1
                        }else{
                            fallos += 1
                        }
                        navController.navigate(route = AppScreens.Results.route)

                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Gray,
                        contentColor = Color(0xFFFFEE58)
                    )
                ) {
                    Text("Corregir")
                }
                Text(text = "Has fallado: $fallos preguntas")


                Button(onClick = {
                    navController.popBackStack()
                },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Gray,
                        contentColor = Color(0xFFFFEE58)
                    )) {
                    Text("Tests")
                }

            }
        }
    }

}