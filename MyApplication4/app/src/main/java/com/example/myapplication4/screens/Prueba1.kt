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
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RadialGradientShader
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication4.navigation.AppScreens

@Composable
fun Prueba1(navController: NavController) {
    Scaffold {
        Prueba1BodyContent(navController)
    }
}

var acertasteP1 = 0;
var fallosP1 = 0

val largeRadialGradient = object : ShaderBrush() {
    override fun createShader(size: Size): Shader {
        val biggerDimension = maxOf(size.height, size.width)
        return RadialGradientShader(
            colors = listOf(Color(0xFF2be4dc), Color(0xFF243484)),
            center = size.center,
            radius = biggerDimension / 2f,
            colorStops = listOf(0f, 0.95f)
        )
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
            .background(largeRadialGradient)
    ) {

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(290.dp)
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

                Button(
                    onClick = {
                        if(pregunta1.value == "h"){
                            acertasteP1 += 1
                        }else{
                            fallosP1 += 1
                        }
                        if(pregunta2.value == "p"){
                            acertasteP1 += 1
                        }else{
                            fallosP1 += 1
                        }
                        if(pregunta3.value == "a"){
                            acertasteP1 += 1
                        }else{
                            fallosP1 += 1
                        }
                        if(pregunta4.value == "br"){
                            acertasteP1 += 1
                        }else{
                            fallosP1 += 1
                        }
                        if(pregunta5.value == "GET"){
                            acertasteP1 += 1
                        }else{
                            fallosP1 += 1
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
