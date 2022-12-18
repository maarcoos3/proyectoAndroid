package com.example.myapplication4.screens

import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication4.navigation.AppScreens

@Composable
fun TeoriaScreen(navController: NavController) {
    Scaffold {
        TeoriaBodyContent(navController)
    }
}

@Composable
fun TeoriaBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF5EF8E1))
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,


        ) {
        Box(modifier = Modifier
            /*.background(color = Color.LightGray)*/
            .padding(horizontal = 7.dp, vertical = 2.dp)
            .fillMaxWidth()
        ) {
        Text(text = "Bienvenido a la teoria de los retos, aqui podras consultar tus dudas sobre las preguntas que encontraras.", fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
    }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp, vertical = 20.dp)
            ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.padding(11.dp))
            Column(
                verticalArrangement = Arrangement.Top,
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Column(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(Color.Cyan, CircleShape)
                            .border(2.dp, Color.Blue, CircleShape),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "<a>", fontStyle = FontStyle.Italic, color = Color.Blue)
                    }
                    Spacer(modifier = Modifier.padding(5.dp))
                    Column(
                        modifier = Modifier
                            .height(50.dp)
                            .background(Color.Cyan)
                            .fillMaxWidth()
                            .border(2.dp, Color.Blue, CircleShape),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Define un hipervínculo", textAlign = TextAlign.Center, color = Color.Blue)
                    }
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<button>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define un botón clickeableo", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<form>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un formulario html", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<link>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define la relación entre un documento y un recurso externo", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<objet>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un objeto embebido", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<output>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define el resultado de un cálculo", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<input>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define un control de entrada de texto", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<label>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define el rótulo para un elemento <input>", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<br>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un salto de línea", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<body>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define el cuerpo del documento", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<footer>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define el pie de página de un documento", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<head>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define información hacerca del documento", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<header>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define la sección de encabezado del documento", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<script>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define un script del lado cliente", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<section>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define una sección de un documento", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<title>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define un título para el documento", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<div>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define una sección en un documento", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<br>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un salto de línea", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<h1>/<h6>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define encabezados o títulos", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<img>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define una imagen", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<p>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un párrafo", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<select>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un drop-down list", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<li>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un ítem de una lista", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<menu>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define la lista de un menú", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<ol>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define una lista ordenada", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<ul>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Define una lista desordenada", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<table>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(15.dp))
                    Text(text = "Define una tabla", textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<tr>", fontStyle = FontStyle.Italic)
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define una fila en una tabla", textAlign = TextAlign.Center)
                }
            }
        }

        Column(
            Modifier
                .fillMaxWidth()
                .background(Color.LightGray),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
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