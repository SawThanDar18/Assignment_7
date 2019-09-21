package com.example.assignment_7.data.models

import android.content.Context
import com.example.assignment_7.network.dataagents.RetrofitDataAgentImpl
import com.example.assignment_7.persistence.MovieDB

open class BaseModel {

    protected val dataAgent = RetrofitDataAgentImpl

    protected lateinit var database: MovieDB

    fun initDatabase(context: Context){
        database = MovieDB.getInstance(context)
    }
}