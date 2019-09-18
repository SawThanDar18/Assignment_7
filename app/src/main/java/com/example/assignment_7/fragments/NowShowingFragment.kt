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
import kotlinx.android.synthetic.main.fragment_now_showing.*

class NowShowingFragment : Fragment() {
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_now_showing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nowShowingAdapter = NowShowingAdapter()

        val layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        now_showing_rv.layoutManager = layoutManager

        now_showing_rv.adapter = nowShowingAdapter
    }

}
