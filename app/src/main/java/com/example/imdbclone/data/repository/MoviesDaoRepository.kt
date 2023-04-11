package com.example.imdbclone.data.repository

import androidx.lifecycle.MutableLiveData
import com.example.imdbclone.R
import com.example.imdbclone.data.model.Actor
import com.example.imdbclone.data.model.Movies

class MoviesDaoRepository {

    var moviesTopRec: MutableLiveData<List<Movies>> = MutableLiveData()


    fun getMovies(): MutableLiveData<List<Movies>> {
        return moviesTopRec
    }


    fun fetchMovies() {
        val movies = mutableListOf<Movies>()

        val actorListAvatar = listOf<Actor>(
            Actor(0, "Sam Worthington", "Jake",R.drawable.samworth),
            Actor(1, "Zoe Saldana", "Neytiri(as Zoe Saldaña)",R.drawable.zoe)
        )

        val actorListJohn = listOf<Actor>(
            Actor(0,"Keanu Reeves","John Wick",R.drawable.keanureeves),
            Actor(1,"Ian McShane","Winston",R.drawable.ianmcshane)
        )

        val actorListBarbie = listOf<Actor>(
            Actor(0,"Margot Robbie","Barbie",R.drawable.margotrobbie),
            Actor(1,"Ryan Gosling","Ken",R.drawable.ryangosling)
        )

        val actorListOppenhimer = listOf<Actor>(
            Actor(0,"Cillian Murphy","J. Robert Oppenheimer",R.drawable.cillianmurphy),
            Actor(1,"Matt Damon","Leslie Groves Jr.",R.drawable.mattdamon)
        )



        val movies1 = Movies(
            0,
            "Avatar 2",
            "7.8",
            "2022",
            "Jake Sully lives with his newfound family formed on the extrasolar moon Pandora",
            "James Cameron",
            "James Cameron",
            actorListAvatar,
            listOf(R.drawable.avatar_back_pic, R.drawable.avatar_pic)
        )

        val movies2 = Movies(
            1,
            "John Wick 4",
            "8.3",
            "2023",
            "John Wick uncovers a path to defeating The High Table. But before he can earn his freedom.",
            "Chad Stahelski",
            "Shay Hatten",
            actorListJohn,
            listOf(R.drawable.john_back_pic,R.drawable.john_pic)
        )

        val movies3 = Movies(
            2,
            "Barbie",
            ".....",
            "2023",
            "To live in Barbie Land is to be a perfect being in a perfect place. Unless you have a full-on existential crisis. Or you're a Ken.",
            "Greta Gerwig",
            "Greta Gerwig",
            actorListBarbie,
            listOf(R.drawable.barbie_back_pic,R.drawable.barbie_pic)
        )

        val movies4 = Movies(
            3,
            "Oppenheimer",
            ".....",
            "2023",
            "The story of American scientist J. Robert Oppenheimer and his role in the development of the atomic bomb.",
            "Christopher Nolan",
            "Christopher Nolan",
            actorListOppenhimer,
            listOf(R.drawable.oppenheimer_back_pic,R.drawable.oppenheimer_pic)
        )


        val moviesL = listOf<Movies>(movies1,movies2,movies3,movies4)

        movies.addAll(moviesL)

        moviesTopRec.value = movies
    }
}