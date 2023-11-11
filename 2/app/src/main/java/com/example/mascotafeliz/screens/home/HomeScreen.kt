package com.example.mascotafeliz.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.mascotafeliz.navigation.Screens

@Composable
fun Home(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
            Text( "")
            Button(onClick = { navController.navigate(route = Screens.Mascotas.name) }) {
                Text(text = "Mascotas")}
            Text( "")
            Button(onClick = { navController.navigate(route = Screens.Alimentos.name) }) {
                Text(text = "Alimentos")}
                Text( "")
                Button(onClick = { navController.navigate(route = Screens.Accesorios.name) }) {
                    Text(text = "Accesorios")}
        }
    }


