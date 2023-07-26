package com.example.cuponex.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cuponex.databinding.FragmentCouponDetailBinding

class CouponDetailFragment : Fragment() {
    private lateinit var binding: FragmentCouponDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCouponDetailBinding.inflate(inflater, container, false)
        return binding.root
    }


}