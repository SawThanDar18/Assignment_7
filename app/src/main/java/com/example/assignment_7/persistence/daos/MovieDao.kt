package com.example.assignment_7.persistence.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.assignment_7.data.vos.MovieVO

@Dao
abstract class MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertMovies(movies: List<MovieVO>): LongArray

    @Query("select * from movie")
    abstract fun getMovies(): List<MovieVO>

    @Query("SELECT * FROM movie WHERE id= :id")
    abstract fun getMoviesById(id: Int): MovieVO
}