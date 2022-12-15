package com.example.myapplication4.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication4.screens.*

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
        composable(route = AppScreens.Results.route){
            Results(navController)
        }
    }

}


