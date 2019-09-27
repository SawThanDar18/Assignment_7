package com.example.assignment_7.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.assignment_7.R
import com.example.assignment_7.activities.DetailActivity
import com.example.assignment_7.adapters.NowShowingAdapter
import com.example.assignment_7.data.vos.MovieVO
import com.example.assignment_7.delegates.ItemClicked
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
        now_showing_rv.adapter = nowShowingAdapter

        movieModel.getAllMovies(
            onSuccess = {moviesVO ->
                nowShowingAdapter.setNewData(moviesVO as MutableList<MovieVO>)
            },
            onFailure = {

            }
        )
    }

    override fun onClicked(id: Int) {
        startActivity(DetailActivity.newIntent(context!!, id))
    }

    /*override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentDelegate = context as FragmentDelegate
    }*/
}
