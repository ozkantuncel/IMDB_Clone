package com.example.imdbclone.ui.detail_screen.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.imdbclone.R
import com.example.imdbclone.data.model.Actor
import com.example.imdbclone.databinding.ActorRecBinding

class DetailFragmentAdapter(
    var mContext: Context,
    private val actors: List<Actor>
) : RecyclerView.Adapter<DetailFragmentAdapter.ViewHolder>()  {

    inner class ViewHolder(private var binding: ActorRecBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Actor) {
            binding.actorData = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ActorRecBinding = DataBindingUtil.inflate(
            LayoutInflater.from(mContext),
            R.layout.actor_rec,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return actors.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val actor = actors[position]
        holder.bind(actor)
    }
}