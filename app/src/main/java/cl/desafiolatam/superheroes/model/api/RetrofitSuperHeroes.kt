package cl.desafiolatam.superheroes.model.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


private const val BASE_URL = "https://www.superheroapi.com/api.php/3466639320041745/"

class RetrofitClient {
    companion object {
        fun retrofitIntance(): ApiSuperHeroes {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(ApiSuperHeroes::class.java)

        }

    }


}