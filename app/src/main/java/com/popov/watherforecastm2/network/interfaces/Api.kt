package com.popov.watherforecastm2.network.interfaces

import com.popov.watherforecastm2.network.models.NetworkDataModel
import retrofit2.http.GET
import retrofit2.http.Query

private const val KEY = "6cf520d6cc6f411587f110159223005"

interface Api {
    @GET("v1/forecast.json?key=$KEY&q=location&days=3&aqi=no&alerts=no&lang=ru")
    suspend fun response(
        @Query("location") location: String,
    ): NetworkDataModel
}