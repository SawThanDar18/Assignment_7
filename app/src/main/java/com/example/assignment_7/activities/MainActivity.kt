package com.example.assignment_7.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment_7.R
import com.example.assignment_7.adapters.TabPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabPagerAdapter = TabPagerAdapter(supportFragmentManager)
        viewPager.adapter = tabPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}
