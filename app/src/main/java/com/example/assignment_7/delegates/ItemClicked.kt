package com.example.assignment_7.delegates

import com.example.assignment_7.data.models.MovieModel

interface ItemClicked {

    fun getAllMovies()
    fun onClicked(id: Int)
}