package com.example.assignment_7.data.models

import com.example.assignment_7.data.vos.MovieVO

object MovieModelImpl: BaseModel(), MovieModel {

    override fun getAllMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit) {

        val movieDataFromDB = database.movieDao().getMovies()
        if (movieDataFromDB.isNotEmpty()) {
            onSuccess(movieDataFromDB)
        }else {
            dataAgent.getAllMovies(
                onSuccess={
                    database.movieDao().insertMovies(it)
                    onSuccess(it)
                },
                onFailure= {

                })
        }
    }
}