package com.example.assignment_7.viewsHolders

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.assignment_7.data.vos.MovieVO
import com.example.assignment_7.delegates.ItemClicked
import kotlinx.android.synthetic.main.now_showing_item_view.view.*

class NowShowingItemViewHolder(itemView: View, private val itemClicked: ItemClicked) : BaseViewHolder<MovieVO>(itemView) {

    init {
        itemView.imageView3.setOnClickListener {
            /*val id = data?.id
            if (id != null){
                itemClicked.onClicked(id)
            }*/
            data?.id?.let {id ->
                itemClicked.onClicked(id)
            }

        }
    }
    override fun bindData(data: MovieVO) {

        itemView.movie_name.text = data.movie_name
        itemView.movie_imdb.text = data.imdb.toString() + "%"
        itemView.movie_rotten.text = data.rotten_tomato.toString() + "%"
        itemView.movie_metacritic.text = data.meta_centric.toString() + "%"
        Glide.with(itemView).load(data.poster).into(itemView.imageView3)
    }
}