package com.example.assignment_7.data.vos

import com.google.gson.annotations.SerializedName

data class MovieVO (

    @SerializedName("id")
    private val id: Int,

    @SerializedName("movie_name")
    private val movie_name: String,

    @SerializedName("imdb")
    private val imdb: Double,

    @SerializedName("rotten_tomato")
    private val rotten_tomato: Int,

    @SerializedName("meta_centric")
    private val meta_centric: Int,

    @SerializedName("genre")
    private val genre: List<GenreVO>,

    @SerializedName("overview")
    private val overview: String,

    @SerializedName("poster")
    private val poster: String

)