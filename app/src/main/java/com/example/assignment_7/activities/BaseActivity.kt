package com.example.assignment_7.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment_7.data.models.MovieModel
import com.example.assignment_7.data.models.MovieModelImpl

abstract class BaseActivity: AppCompatActivity() {

    protected lateinit var movieModel: MovieModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        movieModel = MovieModelImpl
    }
}