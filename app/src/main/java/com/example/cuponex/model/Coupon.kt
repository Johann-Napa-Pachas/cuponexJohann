package com.example.cuponex.model

import com.google.gson.annotations.SerializedName

data class Coupon(
    @SerializedName("url_image")
    val urlImage: String,
    val name: String,
    val store: String,
    val discount: String,
    val detail: String,
    val expiredOn: String,
    @SerializedName("qr_code")
    val qrCode: String = ""
)

fun getData(): List<Coupon>{
    return listOf(
        Coupon("","Nike coupon","Nike store","50","Obten un 50% de descuento por día del padre.","24 June 2023"),
        Coupon("","Nike coupon","Nike store","50","Obten un 50% de descuento por día del padre.","24 June 2023"),
        Coupon("","Nike coupon","Nike store","50","Obten un 50% de descuento por día del padre.","24 June 2023"),
        Coupon("","Nike coupon","Nike store","50","Obten un 50% de descuento por día del padre.","24 June 2023"),
        Coupon("","Nike coupon","Nike store","50","Obten un 50% de descuento por día del padre.","24 June 2023"),
        Coupon("","Nike coupon","Nike store","50","Obten un 50% de descuento por día del padre.","24 June 2023"),
        Coupon("","Nike coupon","Nike store","50","Obten un 50% de descuento por día del padre.","24 June 2023"),
        Coupon("","Nike coupon","Nike store","50","Obten un 50% de descuento por día del padre.","24 June 2023"),
        Coupon("","Nike coupon","Nike store","50","Obten un 50% de descuento por día del padre.","24 June 2023"),
        Coupon("","Nike coupon","Nike store","50","Obten un 50% de descuento por día del padre.","24 June 2023"),
        Coupon("","Nike coupon","Nike store","50","Obten un 50% de descuento por día del padre.","24 June 2023")
    )
}
