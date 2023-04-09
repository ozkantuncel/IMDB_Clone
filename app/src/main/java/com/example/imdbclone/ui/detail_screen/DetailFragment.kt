package com.example.imdbclone.ui.detail_screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.imdbclone.R
import com.example.imdbclone.databinding.FragmentDetailBinding
import com.example.imdbclone.ui.detail_screen.adapter.DetailFragmentAdapter


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_detail,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle: DetailFragmentArgs by navArgs()
        val g = bundle.movies
        binding.movieData = g

        val adapter = DetailFragmentAdapter(requireContext(),g.actors)
        binding.medAdapter = adapter
    }


}