package com.example.myapplication4.screens

import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Box(modifier = Modifier
            .padding(horizontal = 5.dp, vertical = 2.dp)
            .border(width = 1.dp, color = Color.Black)
            .fillMaxWidth()
        ) {
            Text(text = "Bienvenido a la teoria de los retos, aqui podras consultar tus dudas sobre las preguntas que encontraras.")
        }
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxWidth()
                .background(Color.Gray)
                .padding(horizontal = 50.dp, vertical = 20.dp)
            ,
            //verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.padding(11.dp))
            Column(
                verticalArrangement = Arrangement.Top,
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<a>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un hipervínculo")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<button>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un botón clickeableo")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<form>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un formulario html")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<link>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define la relación entre un documento y un recurso externo")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<objet>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un objeto embebido")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<output>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define el resultado de un cálculo")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<input>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un control de entrada de texto")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<label>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define el rótulo para un elemento <input>")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<body>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define el cuerpo del documento")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<body>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define el cuerpo del documento")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<footer>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define el pie de página de un documento")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<head>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define información hacerca del documento")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<header>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define la sección de encabezado del documento")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<script>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un script del lado cliente")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<section>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define una sección de un documento")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<title>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un título para el documento")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<div>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define una sección en un documento")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<br>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un salto de línea")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<h1> a <h6>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define encabezados o títulos")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<img>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define una imagen")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<p>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un párrafo")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<select>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un drop-down list")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<li>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define un ítem de una lista")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<menu>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define la lista de un menú")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<ol>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define una lista ordenada")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<ul>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define una lista desordenada")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<table>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define una tabla")
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "<tr>")
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text(text = "Define una fila en una tabla")
                }
            }
        }

        Box(modifier = Modifier
            .padding(horizontal = 5.dp, vertical = 2.dp)
            .border(width = 1.dp, color = Color.Black)
            .fillMaxWidth()
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .background(Color.Blue),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = {
                    navController.popBackStack()
                }) {
                    Text("Tests")
                }
            }        }

    }
}