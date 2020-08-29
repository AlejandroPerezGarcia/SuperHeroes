package cl.desafiolatam.superheroes.model.api

import retrofit2.Call
import retrofit2.http.GET

interface ApiSuperHeroes {
    @GET("/id")
    fun getAllSuperHeroes(): Call<ArrayList<SuperHeroes>>
}