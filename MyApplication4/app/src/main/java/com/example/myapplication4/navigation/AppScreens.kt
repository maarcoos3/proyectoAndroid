package com.example.myapplication4.navigation

sealed class AppScreens(val route: String){
    object FirstScreen: AppScreens(route = "first_screen")
    object SecondScreen: AppScreens(route = "second_screen")
    object TeoriaScreen: AppScreens(route = "teoria_screen")
    object Prueba1: AppScreens(route = "Prueba1_screen")
    object Prueba2: AppScreens(route = "Prueba2_screen")
    object Results: AppScreens(route = "Results_screen")

}
