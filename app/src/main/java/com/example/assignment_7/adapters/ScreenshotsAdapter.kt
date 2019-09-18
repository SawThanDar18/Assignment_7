package com.example.assignment_7.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_7.R
import com.example.assignment_7.viewsHolders.ScreenshotsItemViewHolder

class ScreenshotsAdapter: RecyclerView.Adapter<ScreenshotsItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScreenshotsItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.screenshots_item_view, parent, false)
        return ScreenshotsItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: ScreenshotsItemViewHolder, position: Int) {

    }
}