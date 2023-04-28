package com.example.rickandmorty.data.remote.api

import com.example.rickandmorty.data.remote.dto.CharacterDto
import com.example.rickandmorty.data.remote.dto.Result
import retrofit2.http.GET
import retrofit2.http.Path

interface RickAndMortyApi {

    @GET()
    suspend fun getCharacters(): Result

    @GET()
    suspend fun characterDetails(
        @Path("id") id: Int
    ): CharacterDto
}