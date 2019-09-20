package com.example.assignment_7.data.vos

import com.google.gson.annotations.SerializedName

data class GenreVO (

    @SerializedName("id")
    private val id: Int,

    @SerializedName("name")
    private val name: String
)