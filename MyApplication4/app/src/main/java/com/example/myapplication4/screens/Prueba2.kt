package com.example.myapplication4.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication4.navigation.AppScreens


@Composable
fun Prueba2(navController: NavController) {
    Scaffold {
        Prueba2BodyContent(navController)
    }
}

var acertasteP2 = 0
var fallosP2 = 0
var corregirP2 = false
@Composable
fun Prueba2BodyContent(navController: NavController) {

    var pregunta1 by remember { mutableStateOf("") }

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

    val pregunta2items = listOf("link", "label", "output", "body")
    val pregunta3items = listOf("select", "menu", "ol", "p")
    val pregunta4items = listOf("head", "p", "a", "body")
    val pregunta5items = listOf("POST", "header", "GET", "footer")


    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .background(largeRadialGradient)
    ) {

        Box(modifier = Modifier
            .fillMaxWidth()
            .size(300.dp)
        ) {
            Column(
                Modifier
                    .padding(40.dp)
            ) {
                Text(text = "¿Qué etiqueta se utiliza para los scripts?: ${pregunta1.ifEmpty { " " }}")
                Spacer(modifier = Modifier.padding(10.dp))
                TextField(value = pregunta1, onValueChange = {pregunta1 = it} )
            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .size(300.dp)
        ) {
            Column(
                Modifier
                    .padding(40.dp)
            ) {
                Text(text = "¿Define el resultado de un cálculo?: ${pregunta2.value.ifEmpty { " " }}")
                Spacer(modifier = Modifier.padding(10.dp))
                pregunta2items.forEach { item ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .selectable(
                                selected = pregunta2isSelectedItem(item),
                                onClick = { pregunta2onChangeState(item) },
                                role = Role.RadioButton
                            )
                            .padding(8.dp)
                    ) {
                        RadioButton(
                            selected = pregunta2isSelectedItem(item),
                            onClick = null
                        )
                        Text(
                            text = item,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .size(300.dp)
        ) {
            Column(
                Modifier
                    .padding(40.dp)
            ) {
                Text(text = "¿Qué etiqueta se utiliza para las lsitas ordenadas?: ${pregunta3.value.ifEmpty { " " }}")
                Spacer(modifier = Modifier.padding(10.dp))
                pregunta3items.forEach { item ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .selectable(
                                selected = pregunta3isSelectedItem(item),
                                onClick = { pregunta3onChangeState(item) },
                                role = Role.RadioButton
                            )
                            .padding(8.dp)
                    ) {
                        RadioButton(
                            selected = pregunta3isSelectedItem(item),
                            onClick = null
                        )
                        Text(
                            text = item,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .size(300.dp)
        ) {
            Column(
                Modifier.padding(40.dp)
            ) {
                Text(text = "¿Qué etiqueta se utiliza para definir información del documento?: ${pregunta4.value.ifEmpty { " " }}")
                Spacer(modifier = Modifier
                    .padding(10.dp)
                )
                pregunta4items.forEach { item ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .selectable(
                                selected = pregunta4isSelectedItem(item),
                                onClick = { pregunta4onChangeState(item) },
                                role = Role.RadioButton
                            )
                            .padding(8.dp)
                    ) {
                        RadioButton(
                            selected = pregunta4isSelectedItem(item),
                            onClick = null
                        )
                        Text(
                            text = item,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        }

        Box(modifier = Modifier
            .fillMaxWidth()
            .size(300.dp)
        ) {
            Column(
                Modifier.padding(20.dp)
            ) {
                Text(text = "¿Qué etiqueta se utiliza para definir el encabezado del documento?: ${pregunta5.value.ifEmpty { " " }}")
                Spacer(
                    modifier = Modifier
                        .padding(10.dp)
                )
                pregunta5items.forEach { item ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .selectable(
                                selected = pregunta5isSelectedItem(item),
                                onClick = { pregunta5onChangeState(item) },
                                role = Role.RadioButton
                            )
                            .padding(8.dp)
                    ) {
                        RadioButton(
                            selected = pregunta5isSelectedItem(item),
                            onClick = null
                        )
                        Text(
                            text = item,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        }


        Box(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color.LightGray)) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                var fallos by remember { mutableStateOf(0) }

                Button(
                    onClick = {
                        if(pregunta1 == "<script>"){
                            acertasteP2 += 1
                        }else{
                            fallosP2 += 1
                        }
                        if(pregunta2.value == "output"){
                            acertasteP2 += 1
                        }else{
                            fallosP2 += 1
                        }
                        if(pregunta3.value == "ol"){
                            acertasteP2 += 1
                        }else{
                            fallosP2 += 1
                        }
                        if(pregunta4.value == "head"){
                            acertasteP2 += 1
                        }else{
                            fallosP2 += 1
                        }
                        if(pregunta5.value == "header"){
                            acertasteP2 += 1
                        }else{
                            fallosP2 += 1
                        }
                        corregirP2 = true
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