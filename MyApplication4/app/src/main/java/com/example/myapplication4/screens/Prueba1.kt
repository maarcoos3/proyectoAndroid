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

@Composable
fun Prueba1(navController: NavController) {
    Scaffold {
        Prueba1BodyContent(navController)
    }
}

@Composable
fun Prueba1BodyContent(navController: NavController) {

    val selectedValue = remember { mutableStateOf("") }

    val isSelectedItem: (String) -> Boolean = { selectedValue.value == it }
    val onChangeState: (String) -> Unit = { selectedValue.value = it }

    val items = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
    ) {

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .background(Color.LightGray),
        ) {
            Column(Modifier.padding(8.dp)) {
                Text(text = "Selected value: ${selectedValue.value.ifEmpty { "NONE" }}")
                items.forEach { item ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.selectable(
                            selected = isSelectedItem(item),
                            onClick = { onChangeState(item) },
                            role = Role.RadioButton
                        ).padding(8.dp)
                    ) {
                        RadioButton(
                            selected = isSelectedItem(item),
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
            .height(400.dp)
            .background(Color.Gray)) {

        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .background(Color.LightGray)) {

        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .background(Color.Gray)) {

        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .background(Color.LightGray)) {

        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .background(Color.Gray)) {

        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.LightGray)) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {

                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Gray,
                        contentColor = Color(0xFFFFEE58)
                    )
                ) {
                    Text("Corregir")
                }
            }
        }
    }
}