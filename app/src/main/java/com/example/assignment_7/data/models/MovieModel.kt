package com.example.assignment_7.data.models

import com.example.assignment_7.data.vos.MovieVO

interface MovieModel {

    fun getAllMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit)

    fun findMovieById(movieId: Int): MovieVO
}