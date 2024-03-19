package br.com.fiap.pontosverdes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.pontosverdes.screens.FirstScreen
import br.com.fiap.pontosverdes.screens.FourthScreen
import br.com.fiap.pontosverdes.screens.SecondScreen
import br.com.fiap.pontosverdes.screens.ThirdScreen
import br.com.fiap.pontosverdes.screens.LastScreen
import br.com.fiap.pontosverdes.ui.theme.PontosVerdesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PontosVerdesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    val (typeOfMaterial, setTypeOfMaterial) = remember { mutableStateOf("") }
                    val (cep, setCep) = remember { mutableStateOf("") }

                    NavHost(navController = navController, startDestination = "first") {
                        composable("first") {
                            FirstScreen(navController)
                        }

                        composable("second") {
                            SecondScreen(navController, typeOfMaterial, setTypeOfMaterial)
                        }

                        composable("third") {
                           ThirdScreen(navController, typeOfMaterial, cep, setCep)
                        }

                        composable("fourth") {
                            FourthScreen(navController, cep, typeOfMaterial)
                        }

                        composable("last") {
                            LastScreen(navController)
                        }
                    }
                }
            }
        }
    }
}













