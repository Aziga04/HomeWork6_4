package com.example.homework6_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework6_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var adapter: PagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = PagerAdapter(this)
        binding.viewPager.adapter = adapter
    }
}