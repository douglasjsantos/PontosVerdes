package br.com.fiap.pontosverdes.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController: NavController, typeOfMaterial: String, setTypeOfMaterial: (String) -> Unit)  {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Escolha o tipo de \n\n" +
                    "resíduo que deseja \n\n" +
                    "reciclar",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 32.dp)
        )

        Spacer(modifier = Modifier.height(0.dp).weight(0.5f))

        Row(
        ) {
            Column(
                modifier = Modifier.weight(1f).padding(20.dp, 0.dp, 4.dp, 4.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {
                        setTypeOfMaterial("Plástico")
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4E802D)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth().height(64.dp)
                ) {
                    Text(
                        text = "Plástico",
                        fontSize = 18.sp
                    )
                }
            }
            Column(
                modifier = Modifier.weight(1f).padding(4.dp, 0.dp, 20.dp, 4.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {
                        setTypeOfMaterial("Papel")
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4E802D)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth().height(64.dp)
                ){
                    Text(
                        text = "Papel",
                        fontSize = 18.sp
                    )
                }
            }
        }

        Row(
        ) {
            Column(
                modifier = Modifier.weight(1f).padding(20.dp, 4.dp, 4.dp, 0.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {
                        setTypeOfMaterial("Vidro")
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4E802D)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth().height(64.dp)
                ) {
                    Text(
                        text = "Vidro",
                        fontSize = 18.sp
                    )
                }
            }
            Column(
                modifier = Modifier.weight(1f).padding(4.dp, 4.dp, 20.dp, 0.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {
                        setTypeOfMaterial("Metal")
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4E802D)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth().height(64.dp)
                ){
                    Text(
                        text = "Metal",
                        fontSize = 18.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(0.dp).weight(1f))

        Button(
            onClick = {
                if (typeOfMaterial != "") {
                    navController.navigate("third")
                }
            },
            enabled = typeOfMaterial != "",
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4E802D)),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp)
        ) {
            Text(
                text = "Continuar",
                style = TextStyle(
                    fontSize = 18.sp
                )
            )
        }
    }
}





