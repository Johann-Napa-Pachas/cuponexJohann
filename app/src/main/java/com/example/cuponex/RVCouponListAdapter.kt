package com.example.cuponex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cuponex.databinding.ItemCouponBinding
import com.example.cuponex.model.Coupon

class RVCouponListAdapter(var coupons: List<Coupon>): RecyclerView.Adapter<CouponVH>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CouponVH {
        val binding = ItemCouponBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CouponVH(binding)
    }

    override fun getItemCount(): Int = coupons.size

    override fun onBindViewHolder(holder: CouponVH, position: Int) {
        holder.bind(coupons.get(position))
    }
}

class CouponVH(private val binding: ItemCouponBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(coupon: Coupon) {
        binding.imageView.setImageResource(R.drawable.ic_logo_nike)
        binding.txtDiscount.text = "${coupon.discount}%"
        binding.txtNameStore.text = coupon.store
        binding.txtDetail.text = coupon.detail
        binding.txtExpiredOn.text = coupon.expiredOn
    }

}