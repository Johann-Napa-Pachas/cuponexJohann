package com.example.cuponex.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
//    https://run.mocky.io/v3/2dc32236-7745-46a4-b56e-c1bbf987d78b
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://run.mocky.io/v3/")
    .client(OkHttpClient())
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    fun getCouponService(): CouponService = retrofit.create(CouponService::class.java)
}