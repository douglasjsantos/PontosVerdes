package br.com.fiap.pontosverdes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import br.com.fiap.pontosverdes.screens.PaginaInicial
import br.com.fiap.pontosverdes.screens.PaginaSecundaria
import br.com.fiap.pontosverdes.screens.PaginaFinal
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
                    PaginaInicial()
                }
            }
        }
    }
}













