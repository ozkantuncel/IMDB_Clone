package com.example.imdbclone.ui.main_screen.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.imdbclone.R
import com.example.imdbclone.data.model.Movies
 import com.example.imdbclone.databinding.TopRecBinding

class MainFragmentTopAdapter(var mContext:Context, private val films:List<Movies>):RecyclerView.Adapter<MainFragmentTopAdapter.ViewHolder>() {

    inner class ViewHolder(private var binding: TopRecBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item:Movies){
            println(item.pictures[1])
            binding.moviesData = item

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding:TopRecBinding = DataBindingUtil.inflate(
            LayoutInflater.from(mContext),
            R.layout.top_rec,
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