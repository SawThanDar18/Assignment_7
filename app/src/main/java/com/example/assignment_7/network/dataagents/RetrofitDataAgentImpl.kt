package com.example.assignment_7.network.dataagents

import com.example.assignment_7.data.vos.MovieVO
import com.example.assignment_7.network.responses.GetMovieResponse
import com.example.assignment_7.network.responses.MovieApi
import com.example.assignment_7.utils.BASE_URL
import com.example.assignment_7.utils.EM_NULL_RESPONSE
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitDataAgentImpl: DataAgent {

    private val movieApi: MovieApi

    companion object{
        private var objInstance: RetrofitDataAgentImpl? = null

        fun getInstance(): RetrofitDataAgentImpl {
            if (objInstance == null) objInstance = RetrofitDataAgentImpl()

            val i = objInstance
            return i!!
        }
    }

    init {
        var okHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .build()

        var retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

        movieApi = retrofit.create(MovieApi::class.java)
    }

    override fun getAllMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit) {
        movieApi.getAllMovies().enqueue(object: Callback<GetMovieResponse>{
            override fun onFailure(call: Call<GetMovieResponse>, t: Throwable) {
                onFailure(t.localizedMessage)
            }

            override fun onResponse(call: Call<GetMovieResponse>, response: Response<GetMovieResponse>) {
                val response = response.body()
                if (response != null) {
                    if (response.data != null) {
                        onSuccess(response.data)
                    } else {
                        onFailure(response.message)
                    }
                }else{
                    onFailure(EM_NULL_RESPONSE)
                }
            }

        })
    }
}