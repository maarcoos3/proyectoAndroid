package com.example.myapplication4.screens

import android.icu.text.AlphabeticIndex.Bucket.LabelType
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

@Composable
fun Prueba1(navController: NavController) {
    Scaffold {
        Prueba1BodyContent(navController)
    }
}




@Composable
fun Prueba1BodyContent(navController: NavController) {

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
            .fillMaxWidth()
    ) {

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(290.dp)
            .background(Color.LightGray),
        ) {
            Column(
                Modifier.padding(40.dp)
            ) {
                Text(text = "¿Qué etiqueta se utiliza para los títulos?: ${pregunta1.value.ifEmpty { "NONE" }}")
                pregunta1items.forEach { item ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .selectable(
                                selected = pregunta1isSelectedItem(item),
                                onClick = { pregunta1onChangeState(item) },
                                role = Role.RadioButton
                            )
                            .padding(8.dp)
                    ) {
                        RadioButton(
                            selected = pregunta1isSelectedItem(item),
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
            .height(290.dp)
            .background(Color.Gray),
        ) {
            Column(
                Modifier.padding(40.dp)
            ) {
                Text(text = "¿Qué etiqueta se utiliza para los párrafos?: ${pregunta2.value.ifEmpty { "NONE" }}")
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
            .height(290.dp)
            .background(Color.LightGray),
        ) {
            Column(
                Modifier.padding(40.dp)
            ) {
                Text(text = "¿Qué etiqueta se utiliza para los enlaces?: ${pregunta3.value.ifEmpty { "NONE" }}")
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
            .height(290.dp)
            .background(Color.Gray),
        ) {
            Column(
                Modifier.padding(40.dp)
            ) {
                Text(text = "¿Qué etiqueta se utiliza para los espaciados?: ${pregunta4.value.ifEmpty { "NONE" }}")
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
            .height(290.dp)
            .background(Color.LightGray),
        ) {
            Column(
                Modifier.padding(40.dp)
            ) {
                Text(text = "¿Con qué método se pasan los datos por la url?: ${pregunta5.value.ifEmpty { "NONE" }}")
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
               // var aciertos by remember { mutableStateOf("0") }
                var acertaste by remember { mutableStateOf(0) }
                var fallos by remember { mutableStateOf(0) }

                Button(
                    onClick = {
                        if(pregunta1.value == "h"){
                            acertaste += 1
                        }else{
                            fallos += 1
                        }
                        if(pregunta2.value == "p"){
                            acertaste += 1
                        }else{
                            fallos += 1
                        }
                        if(pregunta3.value == "a"){
                            acertaste += 1
                        }else{
                            fallos += 1
                        }
                        if(pregunta4.value == "br"){
                            acertaste += 1
                        }else{
                            fallos += 1
                        }
                        if(pregunta5.value == "GET"){
                            acertaste += 1
                        }else{
                            fallos += 1
                        }
                    },
                        colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Gray,
                        contentColor = Color(0xFFFFEE58)
                    )
                ) {
                    Text("Corregir")
                }
                Text(text = "Has acertado: $acertaste preguntas")
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
