package br.com.fiap.pontosverdes.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun FourthScreen(
    navController: NavController,
    cep: String,
    typeOfMaterial: String
) {

    Text(text = cep + "\n\n" + typeOfMaterial)

    Button(
        onClick = {
            navController.navigate("last")
        },
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4E802D)),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 64.dp)
    ) {
        Text(
            text = "Agendar Coleta",
            style = TextStyle(
                fontSize = 18.sp
            )
        )
    }
}