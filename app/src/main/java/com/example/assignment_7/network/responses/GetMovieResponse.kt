package com.example.assignment_7.network.responses

import com.example.assignment_7.data.vos.MovieVO
import com.example.assignment_7.utils.CODE_RESPONSE_OK
import com.google.gson.annotations.SerializedName

data class GetMovieResponse(

    @SerializedName("code")
    val code: Int,

    @SerializedName("message")
    val message: String,

    @SerializedName("data")
    val data: List<MovieVO>?
) {
    fun isResponseOK(): Boolean {
        return code == CODE_RESPONSE_OK && data != null
    }
}