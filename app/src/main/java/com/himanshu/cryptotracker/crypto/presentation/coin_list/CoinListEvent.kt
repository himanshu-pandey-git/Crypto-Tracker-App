package com.himanshu.cryptotracker.crypto.presentation.coin_list

import com.himanshu.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}