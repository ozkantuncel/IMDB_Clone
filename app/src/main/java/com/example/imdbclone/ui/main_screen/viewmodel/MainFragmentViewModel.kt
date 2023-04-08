package com.example.imdbclone.ui.main_screen.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.imdbclone.data.model.Movies
import com.example.imdbclone.data.repository.MoviesDaoRepository

class MainFragmentViewModel(private var moviesDaoRepository: MoviesDaoRepository = MoviesDaoRepository()) :
    ViewModel() {


    var moviesTopRec: MutableLiveData<List<Movies>> = moviesDaoRepository.getMovies()

    init {
        getMovies()
    }

    fun getMovies(){
        moviesDaoRepository.fetchMovies()
    }
}