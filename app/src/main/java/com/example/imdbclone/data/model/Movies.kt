package com.example.imdbclone.data.model

import androidx.annotation.DrawableRes
import java.io.Serializable

data class Movies(
    val id: Int,
    val title: String,
    val rating:String,
    val relData: String,
    val des: String,
    val director: String,
    val author: String,
    val actors: List<Actor>,
    @DrawableRes
    val pictures: List<Int>
):Serializable
