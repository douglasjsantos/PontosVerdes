package br.com.fiap.pontosverdes.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.pontosverdes.R

@Composable
fun ThirdScreen(
    navController: NavController,
    typeOfMaterial: String = "",
    cep: String,
    setCep: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.image2),
            contentDescription = "Image 2",
            modifier = Modifier.fillMaxWidth().height(264.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Você escolheu " + typeOfMaterial,
            style = H1Style,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = "Consulte o lugar mais próximo para fazer o descarte do material",
            style = H2Style,
            textAlign = TextAlign.Left,
            color = Color.Gray,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(0.dp).weight(1f))
        
        TextField(
            value = cep,
            onValueChange = { newValue ->
                if (newValue.all { it.isDigit() }) {
                    setCep(newValue)
                }
            },
            placeholder = { Text("Digite o seu CEP") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
        )

        Button(
            onClick = {
                if (cep != "") {
                    navController.navigate("fourth")
                }
            },
            enabled = cep != "",
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4E802D)),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp)
        ) {
            Text(
                text = "Verificar",
                style = TextStyle(
                    fontSize = 18.sp
                )
            )
        }
    }
}

