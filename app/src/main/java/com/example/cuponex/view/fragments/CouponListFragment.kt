package com.example.cuponex.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cuponex.RVCouponListAdapter
import com.example.cuponex.databinding.FragmentCouponListBinding
import com.example.cuponex.model.Coupon
import com.example.cuponex.model.getData

class CouponListFragment : Fragment() {

    private lateinit var binding: FragmentCouponListBinding
    private lateinit var viewModel: CouponListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(CouponListViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCouponListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RVCouponListAdapter(listOf())
        binding.rvCouponList.adapter = adapter
        binding.rvCouponList.layoutManager = GridLayoutManager(requireContext(), 2, RecyclerView.VERTICAL, false)
        viewModel.couponList.observe(requireActivity()) {
            adapter.coupons = it
            adapter.notifyDataSetChanged()
        }
        viewModel.getCouponsFromService()
    }
}