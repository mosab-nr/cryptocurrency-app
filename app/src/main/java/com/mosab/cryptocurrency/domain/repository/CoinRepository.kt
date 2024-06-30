package com.mosab.cryptocurrency.domain.repository

import com.mosab.cryptocurrency.data.remote.dto.CoinDetailDto
import com.mosab.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}