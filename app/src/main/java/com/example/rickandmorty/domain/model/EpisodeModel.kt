package com.example.rickandmorty.domain.model

data class EpisodeModel(
    val airDate: String,
    val characters: List<String>,
    val created: String,
    val episode: String,
    val id: Int,
    val name: String,
    val url: String
)
