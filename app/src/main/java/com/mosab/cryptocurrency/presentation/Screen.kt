package com.mosab.cryptocurrency.presentation

import okhttp3.Route

sealed class Screen(val route: String) {
    data object CoinListScreen : Screen("coin_list_screen")
    data object CoinDetailScreen : Screen("coin_detail_screen")
}