package com.example.assignment_7.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_7.R
import com.example.assignment_7.viewsHolders.NowShowingItemViewHolder

class NowShowingAdapter: RecyclerView.Adapter<NowShowingItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NowShowingItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.now_showing_item_view, parent, false)
        return NowShowingItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: NowShowingItemViewHolder, position: Int) {

    }
}