package com.mosab.cryptocurrency.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mosab.cryptocurrency.presentation.coindetail.CoinDetailScreen
import com.mosab.cryptocurrency.presentation.coinlist.CoinListScreen
import com.mosab.cryptocurrency.presentation.ui.theme.CryptocurrencyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            CryptocurrencyTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.CoinListScreen.route
                    ){
                        composable(route = Screen.CoinListScreen.route){
                            CoinListScreen(navController = navController)
                        }
                        composable(route = Screen.CoinDetailScreen.route+"/{coinId}"){
                            CoinDetailScreen()
                        }
                    }
                }
            }
        }
    }
}