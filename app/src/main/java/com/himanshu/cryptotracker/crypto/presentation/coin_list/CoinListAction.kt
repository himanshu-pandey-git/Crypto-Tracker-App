package com.himanshu.cryptotracker.crypto.presentation.coin_list

import com.himanshu.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinCLick(val coinUi: CoinUi): CoinListAction
}