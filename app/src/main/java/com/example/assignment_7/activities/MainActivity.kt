package com.example.assignment_7.activities

import android.os.Bundle
import com.example.assignment_7.R
import com.example.assignment_7.adapters.TabPagerAdapter
import com.example.assignment_7.data.vos.MovieVO
import com.example.assignment_7.delegates.FragmentDelegate
import com.example.assignment_7.fragments.NowShowingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabPagerAdapter = TabPagerAdapter(supportFragmentManager)
        viewPager.adapter = tabPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }

    /*override fun onCreateFragment(nowShowingFragment: NowShowingFragment) {

        movieModel.getAllMovies(
            onSuccess = {moviesVO ->
                nowShowingFragment.nowShowingAdapter.setNewData(moviesVO as MutableList<MovieVO>)
            },
            onFailure = {

            }
        )
    }*/

}
