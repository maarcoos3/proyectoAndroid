package com.example.myapplication4.navigation

sealed class AppScreens(val route: String){
    object FirstScreen: AppScreens(route = "first_screen")
    object SecondScreen: AppScreens(route = "second_screen")
    object TeoriaScreen: AppScreens(route = "teoria_screen")
}
