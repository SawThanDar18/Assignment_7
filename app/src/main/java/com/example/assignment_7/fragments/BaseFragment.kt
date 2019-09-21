package com.example.assignment_7.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.assignment_7.R
import com.example.assignment_7.data.models.MovieModel
import com.example.assignment_7.data.models.MovieModelImpl

abstract class BaseFragment : Fragment() {

    protected lateinit var movieModel: MovieModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        movieModel = MovieModelImpl
    }


}
