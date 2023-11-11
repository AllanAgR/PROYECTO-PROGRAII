package com.example.mascotafeliz.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mascotafeliz.R
import com.example.mascotafeliz.ui.theme.MascotaFelizTheme

@Composable
fun Alimentos(navController: NavController){
    contenta()

}

@Composable
fun contenta(){
    Carritoc()
    CardAlimentos()
}

@Preview (showBackground = true)
@Composable
fun Previewcontenta(){
    MascotaFelizTheme {
        contenta()
    }
}

@Composable
fun Carritoc(){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.Start
        //verticalArrangement = Arrangement.Center
    ) {
        Text("CATALOGO DE PRODUCTOS Y MASCOTAS")
        Spacer(modifier = Modifier.height(21.dp))

        Row {
            OutlinedButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Rounded.ShoppingCart, contentDescription = null)
                Text(text = "Ver Carrito")

            }
        }
    }
}
//@Preview(showBackground = true)
@Composable
fun CarritocPreview(){
    MascotaFelizTheme {
        Carrito()
    }
}
@Composable
fun CardAlimentos() {

    Card(modifier = Modifier
        .padding(100.dp)
        .clickable { }
        .fillMaxWidth(),
        //elevation = 8.dp,
        shape = RoundedCornerShape(8.dp))
    {
        Column {
            Image(
                painter = painterResource(id = R.drawable.alimentos),
                contentDescription = "COMIDA"
            )

            Column(
                modifier = Modifier.padding(16.dp)
            )
            {
                Text(
                    "Alimentos para perros",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "Precio:  Q.40.00",
                    style = MaterialTheme.typography.titleMedium
                )

                Row(

                )
                {
                    var showDialog by remember { mutableStateOf(false) }

                    var nombre by remember { mutableStateOf(false) }
                    var aceptar by remember { mutableStateOf(false) }

                    if (showDialog){
                        AlertDialog(
                            onDismissRequest = {showDialog=false},
                            confirmButton = {
                                TextButton(onClick = { /*TODO*/ }) {
                                    Text(text = "Aceptar")
                                }
                            },
                            dismissButton = {
                                TextButton(onClick = { showDialog = false}) {
                                    Text(text = "Cancelar")
                                }
                            },
                            title = { Text(text = "¿Está seguro que quiere agregar al carrito?")},
                            text = {
                                Column {
                                    Text(text = "Alimento para Cachorro, peso: 20lb")

                                    val nombre = "Alimento"
                                    val codigo = "CERO DOS"


                                }
                            }
                        )
                    }

                    OutlinedButton(onClick = {showDialog = true}) {
                        Icon(Icons.Rounded.Add, contentDescription = null)
                        Text("Añadir al Carrito")
                    }
                }
            }
        }
    }
}


