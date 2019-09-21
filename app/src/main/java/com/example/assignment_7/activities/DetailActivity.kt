package com.example.assignment_7.activities

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_7.adapters.CastAdapter
import com.example.assignment_7.adapters.ScreenshotsAdapter
import kotlinx.android.synthetic.main.activity_detail.*
import com.example.assignment_7.R

class DetailActivity: BaseActivity() {

    private lateinit var castAdapter: CastAdapter
    private lateinit var screenshotsAdapter: ScreenshotsAdapter

    val EXTRA_ID_EXTRA = "movieId"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val linearLayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        cast_rv.layoutManager = linearLayoutManager

        castAdapter = CastAdapter()
        cast_rv.adapter = castAdapter

        val ss_linearLayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        screenshots_rv.layoutManager = ss_linearLayoutManager

        screenshotsAdapter = ScreenshotsAdapter()
        screenshots_rv.adapter = screenshotsAdapter

        clear_iv.setOnClickListener {
            finish()
        }
    }
}