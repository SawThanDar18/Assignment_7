package com.example.assignment_7.data.models

import com.example.assignment_7.data.vos.MovieVO

interface MovieModel {

    fun getAllMovies(delegate: GetDataFromNetworkDelegate)

    fun findMovieById(movieId: Int): MovieVO

    interface GetDataFromNetworkDelegate {
        fun onSuccess(movieVO: List<MovieVO>)
        fun onFailure(errorMessage: String)
    }
}