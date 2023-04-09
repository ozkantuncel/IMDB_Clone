package com.example.imdbclone.ui.main_screen.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.imdbclone.R
import com.example.imdbclone.data.model.Movies
import com.example.imdbclone.databinding.BottomRecBinding
import com.example.imdbclone.ui.main_screen.viewmodel.MainFragmentViewModel

class MainFragmentBottomAdapter(
    var mContext: Context,
    private val films: List<Movies>,
    private val viewModel: MainFragmentViewModel
) : RecyclerView.Adapter<MainFragmentBottomAdapter.ViewHolder>()  {

    inner class ViewHolder(private var binding: BottomRecBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Movies) {
            binding.moviesData = item

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: BottomRecBinding = DataBindingUtil.inflate(
            LayoutInflater.from(mContext),
            R.layout.bottom_rec,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return films.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val film = films[position]
        holder.bind(film)
    }
}