package com.example.assignment_7

import android.app.Application

import com.example.assignment_7.data.models.MovieModelImpl

class MovieApp: Application() {

    override fun onCreate() {
        super.onCreate()
        MovieModelImpl.initDatabase(applicationContext)
    }
}