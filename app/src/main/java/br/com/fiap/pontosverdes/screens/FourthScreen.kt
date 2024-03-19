package br.com.fiap.pontosverdes.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.pontosverdes.R
import br.com.fiap.pontosverdes.fourthScreen.components.ImagemComponent
import br.com.fiap.pontosverdes.fourthScreen.components.TextLocalizacao
import br.com.fiap.pontosverdes.fourthScreen.components.TextPontoverdeMaisProximo
import br.com.fiap.pontosverdes.models.Endereco
import br.com.fiap.pontosverdes.models.FourthScreenModel
import br.com.fiap.pontosverdes.repositories.getMaterial

@Composable
fun FourthScreen(
    navController: NavController,
    cep: String,
    typeOfMaterial: String,
) {

//    Text(text = cep + "\n\n" + typeOfMaterial)
//
//    Button(
//        onClick = {
//            navController.navigate("last")
//        },
//        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4E802D)),
//        shape = RoundedCornerShape(8.dp),
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 16.dp, vertical = 64.dp)
//    ) {
//        Text(
//            text = "Agendar Coleta",
//            style = TextStyle(
//                fontSize = 18.sp
//            )
//        )
//    }


    /////////////
    val fourthScreenModel = FourthScreenModel()

    val material by fourthScreenModel.material.observeAsState(initial = getMaterial().filter { material -> material.nome == typeOfMaterial }[0])

    val cepLocalizacao by fourthScreenModel.cepLocalizacao.observeAsState(initial = cep)
    val localizacao by fourthScreenModel.localizacao.observeAsState(initial = Endereco())


    val cepPontoVerde by fourthScreenModel.cepPontoVerde.observeAsState(material.enderecos.random())
    val localizacaoPontoVerde by fourthScreenModel.localizacaoPontoVerde.observeAsState(initial = Endereco())

    val texto by fourthScreenModel.texto.observeAsState(initial = "")


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        ImagemComponent(
            proporcao = 1.48f,
            contentDescription = "Imagem de cidade modernista",
            id = R.drawable.image3
        )


        Spacer(modifier = Modifier.height(30.dp))


        TextLocalizacao(
            cepLocalizacao = cepLocalizacao,
            localizacao = localizacao,
            updateLocalizacao = { fourthScreenModel.updateLocalizacao(it) }
        )


        Spacer(modifier = Modifier.height(30.dp))


        TextPontoverdeMaisProximo(
            material = material,
            cepPontoVerde = cepPontoVerde,
            localizacaoPontoVerde = localizacaoPontoVerde,
            updateLocalizacaoPontoVerde = { fourthScreenModel.updateLocalizacaoPontoVerde(it) },
            updateTexto = {fourthScreenModel.updateTexto(it)},
            texto = texto
        )


        Spacer(modifier = Modifier.height(30.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {
                    navController.navigate("last")
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff4E802D)
                ), shape = RoundedCornerShape(8.dp), modifier = Modifier
                    .height(42.dp)
                    .width(334.dp)

            ) {
                Text(text = "Agendar coleta", fontSize = 20.sp, fontWeight = FontWeight.Medium)
            }
        }

    }
}