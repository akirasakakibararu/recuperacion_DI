package com.example.akira_recuperacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.akira_recuperacion.ui.theme.Akira_RecuperacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Akira_RecuperacionTheme {
                vistaRecuperacion()
            }
        }
    }
}

@Composable
fun vistaRecuperacion() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)
            .padding(40.dp),
        verticalArrangement = Arrangement.Bottom
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Black)
                .padding(40.dp)
        ){
            Column {
                texto("Hello Android!", Color.Red)
            }
            Column (
                modifier = Modifier
                    .weight(1f),
                horizontalAlignment = Alignment.End
            ){
                texto("Hello Android!", Color.Cyan)
            }
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Gray)
                .padding(40.dp),

        ){
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally),
                verticalArrangement = Arrangement.Center
            ){
                Row { texto("Hello Android!", Color.Yellow) }
                Row { texto("Hello Android!", Color.Red) }
                Row { texto("Hello Android!", Color.White) }
            }
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Green),
                    horizontalAlignment = Alignment.End
        ){
            Row (
                modifier = Modifier
                    .background(color = Color.Blue)
            ){
                boton(1)
                boton(2)
                boton(3)
            }
            Row (
                modifier = Modifier
                    .background(color = Color.Yellow)
                    .padding(horizontal =  40.dp)
            ){
                boton(1)
                boton(2)
                boton(3)
            }
            Row (
                modifier = Modifier
                    .background(color = Color.White)
            ){
                boton(1)
                boton(2)
                boton(3)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Akira_RecuperacionTheme {
        vistaRecuperacion()
    }
}

@Composable
fun boton (numero : Int) {
    Button(
        onClick = {},
        modifier = Modifier
            .size(60.dp),
        shape = CircleShape
    ) {
        Text(
            text = numero.toString()
        )
    }
}

@Composable
fun texto (mensaje: String, colorElegido : Color) {
    Text(
        text = mensaje,
        modifier = Modifier
            .background(colorElegido)
    )
}