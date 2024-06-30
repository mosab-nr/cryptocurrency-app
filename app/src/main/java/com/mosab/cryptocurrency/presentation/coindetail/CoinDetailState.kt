package com.mosab.cryptocurrency.presentation.coindetail

import com.mosab.cryptocurrency.domain.model.Coin
import com.mosab.cryptocurrency.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
