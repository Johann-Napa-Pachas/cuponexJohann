package com.example.cuponex.data.repository

import com.example.cuponex.data.response.ApiResponse
import com.example.cuponex.data.response.CouponListResponse
import com.example.cuponex.data.retrofit.RetrofitInstance
import java.lang.Exception

class CouponsRepository {
    suspend fun getCoupons():ApiResponse<CouponListResponse>{
        return try{
            val response = RetrofitInstance.getCouponService().getCoupons()
            ApiResponse.Success(response)
        }catch (e: Exception){
            ApiResponse.Error(e)
        }
    }
}