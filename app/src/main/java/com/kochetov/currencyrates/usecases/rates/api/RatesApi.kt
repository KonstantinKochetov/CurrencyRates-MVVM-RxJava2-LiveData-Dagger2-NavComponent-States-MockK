package com.kochetov.currencyrates.usecases.rates.api

import com.kochetov.currencyrates.usecases.rates.model.RatesResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface RatesApi {

    companion object {
        private const val CURRENCY_RATES_LATEST = "android/latest"
    }

    @GET(CURRENCY_RATES_LATEST)
    fun getRates(@Query("base") apiBase: String): Single<RatesResponse>
}
