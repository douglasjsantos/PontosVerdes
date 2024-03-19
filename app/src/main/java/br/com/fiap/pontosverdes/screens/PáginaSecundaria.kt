package br.com.fiap.pontosverdes.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PaginaSecundaria()  {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(

            text = "Escolha o tipo de resíduo que deseja reciclar",
            fontSize = 30.sp,
            fontWeight = FontWeight.Medium
        )
        Row(
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier
                .height(250.dp),
        ) {
            Column(
                modifier = Modifier
                    .width(180.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF4E802D)
                    )
                ) {

                    Text(
                        text = " Plástico ",
                        fontSize = 30.sp
                    )
                }
            }
            Column(
                modifier = Modifier
                    .width(180.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF4E802D)
                    )
                ){
                    Text(
                        text = "   Papel   ",
                        fontSize = 30.sp
                    )
                }
            }
        }
        Row(
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier
                .height(250.dp),
        ) {
            Column(
                modifier = Modifier
                    .height(180.dp)
                    .width(180.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF4E802D)
                    )
                ) {

                    Text(
                        text = "   Vidro    ",
                        fontSize = 30.sp
                    )
                }
            }
            Column(
                modifier = Modifier
                    .height(180.dp)
                    .width(180.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF4E802D)
                    )
                ) {
                    Text(
                        text = "   Metal   ",
                        fontSize = 30.sp)
                }
            }
        }
        Row(
            modifier = Modifier
                .height(500.dp),
            verticalAlignment = Alignment.Bottom

        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF4E802D)
                )
                ) {
                Text(
                    text = "Continuar",
                    fontSize = 26.sp)
            }
        }
    }
}





