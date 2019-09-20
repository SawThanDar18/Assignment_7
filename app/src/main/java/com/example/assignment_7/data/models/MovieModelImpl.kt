package com.example.assignment_7.data.models

import com.example.assignment_7.data.vos.MovieVO

class MovieModelImpl: BaseModel(), MovieModel {

    private lateinit var dataRepository: Map<Int, MovieVO>

    companion object {
        private var objInstance: MovieModelImpl? = null

        fun getInstance(): MovieModelImpl {

            if (objInstance == null) objInstance = MovieModelImpl()

            val i = objInstance
            return i!!
        }
    }

    override fun getAllMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit) {

    }

    override fun findMovieById(movieId: Int): MovieVO {

    }

}