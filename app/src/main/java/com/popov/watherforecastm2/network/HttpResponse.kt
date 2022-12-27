package com.popov.watherforecastm2.network

import com.popov.watherforecastm2.network.interfaces.Api
import com.popov.watherforecastm2.network.models.NetworkDataModel
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private const val URL = "https://api.weatherapi.com/"

class HttpResponse: Api {
    private val loggingInterceptor = HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)

    private val client = OkHttpClient
        .Builder()
        .addInterceptor(loggingInterceptor)
        .build()

    private val moshi: Moshi = Moshi
        .Builder()
        .build()

    private val moshiConverterFactory: MoshiConverterFactory = MoshiConverterFactory
        .create(moshi)

    private val retrofit: Retrofit = Retrofit
        .Builder()
        .baseUrl(URL)
        .client(client)
        .addConverterFactory(moshiConverterFactory)
        .build()

    private val api: Api = retrofit.create(Api::class.java)

    override suspend fun response(location: String): NetworkDataModel {
        return api.response(location = location)
    }
}