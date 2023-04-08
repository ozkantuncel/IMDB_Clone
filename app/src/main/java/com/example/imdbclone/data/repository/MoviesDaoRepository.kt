package com.example.imdbclone.data.repository

import androidx.lifecycle.MutableLiveData
import com.example.imdbclone.R
import com.example.imdbclone.data.model.Actor
import com.example.imdbclone.data.model.Movies

class MoviesDaoRepository {

    var moviesTopRec: MutableLiveData<List<Movies>> = MutableLiveData()


    fun getMovies():MutableLiveData<List<Movies>>{
        return moviesTopRec
    }


    fun fetchMovies(){
         var movies = mutableListOf<Movies>()
         var actor = mutableListOf<Actor>()
         var pictures = mutableListOf<Int>()

        var actor1 = Actor(0, "Sam Worthington", 5)

        actor.add(actor1)

        pictures.addAll(listOf(R.drawable.avatar_back_pic, R.drawable.avatar_pic))

        var movies1 = Movies(
            0,
            "Avatar 2",
            "7.8",
            "2022",
            "Jake Sully lives with his newfound family formed on the extrasolar moon Pandora",
            "James Cameron",
            "James Cameron",
            actor,
            pictures
        )

        var movies2 = Movies(
            0,
            "Avatar 2",
            "7.8",
            "2022",
            "Jake Sully lives with his newfound family formed on the extrasolar moon Pandora",
            "James Cameron",
            "James Cameron",
            actor,
            pictures
        )
         var moviesL = listOf<Movies>(movies1,movies2)

        movies.addAll(moviesL)

        moviesTopRec.value = movies
    }
}