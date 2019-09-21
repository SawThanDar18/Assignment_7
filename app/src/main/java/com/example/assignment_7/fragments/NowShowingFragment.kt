package com.example.assignment_7.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.LinearLayout.HORIZONTAL
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.assignment_7.R
import com.example.assignment_7.adapters.NowShowingAdapter
import com.example.assignment_7.data.models.MovieModel
import com.example.assignment_7.data.models.MovieModelImpl
import com.example.assignment_7.data.vos.MovieVO
import com.example.assignment_7.delegates.ItemClicked
import com.example.assignment_7.network.dataagents.RetrofitDataAgentImpl
import kotlinx.android.synthetic.main.fragment_now_showing.*

class NowShowingFragment : BaseFragment(), ItemClicked {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_now_showing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nowShowingAdapter = NowShowingAdapter(this)

        val layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        now_showing_rv.layoutManager = layoutManager

        movieModel.getAllMovies(
            onSuccess = {moviesVO ->
                nowShowingAdapter.setNewData(moviesVO as MutableList<MovieVO>)
                now_showing_rv.adapter = nowShowingAdapter
            },
            onFailure = {
            }
        )

    }

    override fun onClicked(id: Int) {

    }

}
