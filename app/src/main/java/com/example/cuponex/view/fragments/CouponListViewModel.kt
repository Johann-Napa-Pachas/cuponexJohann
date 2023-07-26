package com.example.cuponex.view.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cuponex.data.repository.CouponsRepository
import com.example.cuponex.data.response.ApiResponse
import com.example.cuponex.model.Coupon
import com.example.cuponex.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CouponListViewModel: ViewModel() {
    val repository = CouponsRepository()
    val couponList: MutableLiveData<List<Coupon>> = MutableLiveData<List<Coupon>>()
    fun getCouponList(){
        val data = getData()
        couponList.value = data
    }

    fun getCouponsFromService(){
        viewModelScope.launch(Dispatchers.IO){
            val response = repository.getCoupons()
            when(response){
                is ApiResponse.Error -> {}
                is ApiResponse.Success -> {
                    couponList.postValue(response.data.coupons)
                }
            }
        }
    }
}