package com.example.cuponex.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.cuponex.R
import com.example.cuponex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnEdit.setOnClickListener {
            val intent = Intent(this, AddCouponActivity::class.java)
            startActivity(intent)
        }
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcv_coupon) as NavHostFragment
        val navController = navHostFragment.navController
        binding.btnMenu.setupWithNavController(navController)
//        binding.btnMenu.setOnItemSelectedListener { item ->
//            when(item.itemId){
//                R.id.couponList ->{
//                    binding.txtHello.text = "Coupon List"
//                    supportFragmentManager.beginTransaction().add(CouponListFragment(),"").commit()
//                    true
//                }
//                R.id.couponFavorite ->{
//                    binding.txtHello.text = "Favorite"
//                    true
//                }
//                R.id.couponInformation -> {
//                    binding.txtHello.text = "Info"
//                    true
//                }
//                else -> {
//                    binding.txtHello.text = "Error"
//                    false
//                }
//            }
//        }
    }
}