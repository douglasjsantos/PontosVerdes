package br.com.fiap.pontosverdes.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.pontosverdes.R

val H1Style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold)
val H2Style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Normal)

@Composable
fun FirstScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.image1
            ), contentDescription = "Imagem 1",
            modifier = Modifier
                .fillMaxWidth()
                .height(440.dp))

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Descubra novas maneiras de descartar o lixo",
            style = H1Style,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Explore o mapa,",
            style = H2Style,
            textAlign = TextAlign.Center,
            color = Color.Gray
        )

        Text(
            text = "veja pontos de coletas e",
            style = H2Style,
            textAlign = TextAlign.Center,
            color = Color.Gray
        )

        Text(
            text = "dicas de como descartar o lixo",
            style = H2Style,
            textAlign = TextAlign.Center,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(0.dp).weight(1f))

        Button(
            onClick = {
                navController.navigate("second")
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4E802D)),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp)
        ) {
            Text(
                text = "Vamos lá",
                style = TextStyle(
                    fontSize = 18.sp
                )
            )
        }
    }
}