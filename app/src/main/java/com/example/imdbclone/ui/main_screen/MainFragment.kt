package com.example.imdbclone.ui.main_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.imdbclone.R
import com.example.imdbclone.data.model.Actor
import com.example.imdbclone.data.model.Movies
import com.example.imdbclone.databinding.MainFragmentBinding
import com.example.imdbclone.ui.main_screen.adapter.MainFragmentTopAdapter

class MainFragment : Fragment() {
    private lateinit var binding: MainFragmentBinding
    private var movies = mutableListOf<Movies>()
    private var actor = mutableListOf<Actor>()

    private var pictures = mutableListOf<Int>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var actor1 = Actor(0, "Sam Worthington", 5)
        actor.add(actor1)

        pictures.addAll(listOf(R.drawable.avatar_back_pic, R.drawable.avatar_pic))

        var movies1 = Movies(
            0,
            "Avatar 2",
            "2022",
            "Jake Sully lives with his newfound family formed on the extrasolar moon Pandora",
            "James Cameron",
            "James Cameron",
            actor,
            pictures
        )
        movies.add(movies1)

        val adapterTop = MainFragmentTopAdapter(requireContext(),movies)
        binding.mainTopAdapter = adapterTop
    }
}