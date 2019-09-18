package com.example.assignment_7.viewsHolders

import android.view.View
import com.example.assignment_7.data.vos.MovieVO
import com.example.assignment_7.delegates.ItemClicked

class NowShowingItemViewHolder(itemView: View, private val itemClicked: ItemClicked) : BaseViewHolder<MovieVO>(itemView) {

    init {
        itemView.setOnClickListener {
            /*val id = data?.id
            if (id != null){
                itemClicked.onClicked(id)
            }*/
        }
    }
    override fun bindData(data: MovieVO) {

    }
}