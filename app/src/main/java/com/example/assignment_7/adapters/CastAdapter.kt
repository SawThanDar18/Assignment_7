package com.example.assignment_7.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_7.R
import com.example.assignment_7.viewsHolders.CastItemViewHolder

class CastAdapter: RecyclerView.Adapter<CastItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CastItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cast_item_view, parent, false)
        return CastItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: CastItemViewHolder, position: Int) {

    }
}