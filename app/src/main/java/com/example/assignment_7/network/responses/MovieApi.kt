package com.example.assignment_7.network.responses

import com.example.assignment_7.utils.GET_API
import retrofit2.Call
import retrofit2.http.POST

interface MovieApi {

    @POST(GET_API)
    fun getAllMovies(): Call<GetMovieResponse>
}