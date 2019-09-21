package com.example.assignment_7.data.vos

import com.google.gson.annotations.SerializedName

data class MovieVO (

    @SerializedName("id")
    val id: Int,

    @SerializedName("movie_name")
    val movie_name: String,

    @SerializedName("imdb")
    val imdb: Double,

    @SerializedName("rotten_tomato")
    val rotten_tomato: Int,

    @SerializedName("meta_centric")
    val meta_centric: Int,

    @SerializedName("genre")
    val genre: List<GenreVO>,

    @SerializedName("overview")
    val overview: String,

    @SerializedName("poster")
    val poster: String

)