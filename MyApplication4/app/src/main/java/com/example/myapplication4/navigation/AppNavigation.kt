package com.example.myapplication4.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication4.screens.FirstScreen
import com.example.myapplication4.screens.Prueba1
import com.example.myapplication4.screens.SecondScreen
import com.example.myapplication4.screens.TeoriaScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination= AppScreens.FirstScreen.route){
        composable(route= AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route= AppScreens.SecondScreen.route){
            SecondScreen(navController)
        }
        composable(route = AppScreens.TeoriaScreen.route){
            TeoriaScreen(navController)
        }
        composable(route = AppScreens.Prueba1.route){
            Prueba1(navController)
        }
    }

}


