package com.example.mascotafeliz.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mascotafeliz.screens.Accesorios
import com.example.mascotafeliz.screens.Alimentos
import com.example.mascotafeliz.screens.Mascotas
import com.example.mascotafeliz.screens.SplashScreen
import com.example.mascotafeliz.screens.home.Home
import com.example.mascotafeliz.screens.login.Login

@Preview (showBackground = true)
@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.name
     ){
        composable(Screens.SplashScreen.name){
            SplashScreen(navController = navController)
        }
        composable(Screens.Login.name){
            Login(navController = navController)
        }
        composable(Screens.HomeScreen.name){
            Home(navController = navController)
        }
        composable(Screens.Mascotas.name){
            Mascotas(navController = navController)
        }
        composable(Screens.Alimentos.name){
            Alimentos(navController = navController)
        }
        composable(Screens.Accesorios.name){
            Accesorios(navController = navController)
        }
    }
}