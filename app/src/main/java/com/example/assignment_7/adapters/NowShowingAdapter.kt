package com.example.assignment_7.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.assignment_7.R
import com.example.assignment_7.data.vos.MovieVO
import com.example.assignment_7.delegates.ItemClicked
import com.example.assignment_7.viewsHolders.NowShowingItemViewHolder

class NowShowingAdapter(private val itemClicked: ItemClicked): BaseAdapter<NowShowingItemViewHolder, MovieVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NowShowingItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.now_showing_item_view, parent, false)
        return NowShowingItemViewHolder(view, itemClicked)
    }
}