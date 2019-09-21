package com.example.assignment_7.data.models

import com.example.assignment_7.data.vos.MovieVO

object MovieModelImpl: BaseModel(), MovieModel {

    override fun getAllMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit) {
        dataAgent.getAllMovies(onSuccess, onFailure)
    }
}