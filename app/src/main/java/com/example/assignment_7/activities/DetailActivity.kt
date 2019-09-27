package com.example.assignment_7.activities

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.assignment_7.adapters.CastAdapter
import com.example.assignment_7.adapters.ScreenshotsAdapter
import kotlinx.android.synthetic.main.activity_detail.*
import com.example.assignment_7.R
import com.example.assignment_7.data.vos.MovieVO
import kotlinx.android.synthetic.main.activity_detail.view.*

class DetailActivity: BaseActivity() {

    private lateinit var castAdapter: CastAdapter
    private lateinit var screenshotsAdapter: ScreenshotsAdapter

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

        val id = intent.getIntExtra(EXTRA_MOVIE_ID, 0)

        if (id != 0){
            val movieVO = movieModel.findMovieById(id)
            bindData(movieVO)
        }

        clear_iv.setOnClickListener {
            this.finish()
        }
    }

    fun bindData(data: MovieVO){
        detail_movie_name.text = data.movie_name
        detail_movie_imdb.text = data.imdb.toString() + "%"
        detail_movie_rotten.text = data.rotten_tomato.toString() + "%"
        detail_movie_metacritic.text = data.meta_centric.toString() + "%"
        detail_movie_desc.text = data.overview
    }

    companion object{

        const val EXTRA_MOVIE_ID = "id"

        //scope function
        fun newIntent(context: Context, id: Int): Intent {
            return Intent(context, DetailActivity::class.java).apply {
                putExtra(EXTRA_MOVIE_ID, id)
            }
        }
    }
}