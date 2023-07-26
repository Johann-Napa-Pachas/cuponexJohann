package com.example.cuponex.data.retrofit

import com.example.cuponex.data.response.CouponListResponse
import retrofit2.http.GET

interface CouponService {
    @GET("2dc32236-7745-46a4-b56e-c1bbf987d78b")
    suspend fun getCoupons(): CouponListResponse
}