package com.example.assignment_7.persistence

import android.content.Context
import androidx.room.*
import com.example.assignment_7.data.vos.MovieVO
import com.example.assignment_7.persistence.daos.MovieDao
import com.example.assignment_7.persistence.typeconverters.GenreTypeConverter
import com.example.assignment_7.utils.DB_NAME

@Database(entities = arrayOf(MovieVO::class), version = 2, exportSchema = false)
@TypeConverters(GenreTypeConverter::class)
abstract class MovieDB: RoomDatabase() {

    abstract fun movieDao(): MovieDao

    companion object{
        var INSTANCE: MovieDB? = null

        fun getInstance(context: Context): MovieDB{
            if (INSTANCE == null){
                INSTANCE = Room.databaseBuilder(context, MovieDB::class.java, DB_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return INSTANCE!!
        }
    }

    fun areDatasExitInDB(): Boolean{
        return movieDao().getMovies().isNotEmpty()
    }
}