package com.example.cuponex.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cuponex.R
import com.example.cuponex.databinding.ActivityMapBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActivityMapBinding
    private lateinit var googleMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fragmentMap = supportFragmentManager.findFragmentById(R.id.fcv_map) as SupportMapFragment
        fragmentMap.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map
        val idatCentroLocation = LatLng(-12.066877,-77.035721)
        val idatSJLLocation = LatLng(-11.9986873,-77.0210552)
        googleMap.addMarker(MarkerOptions().position(idatCentroLocation).title("Idat Centro"))
        googleMap.addMarker(MarkerOptions().position(idatSJLLocation).title("Idat San Juan De Lurigancho"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(idatCentroLocation, 12f))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(idatSJLLocation, 12f))
    }
}