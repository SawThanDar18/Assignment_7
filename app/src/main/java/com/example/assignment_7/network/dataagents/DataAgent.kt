package com.example.assignment_7.network.dataagents

import com.example.assignment_7.data.vos.MovieVO

interface DataAgent {

    fun getAllMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit)
}