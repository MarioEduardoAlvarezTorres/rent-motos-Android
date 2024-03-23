package com.example.rentamoto.data

import com.example.rentamoto.data.model.RemoteResult
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    @GET("usuario")
    suspend fun listMotos(
        @Query("nombre") nombre : String,
        @Query("email") email : String,
        @Query("telefono") telefono : String
    ): RemoteResult
}

object RetrofitServiceFactory{
    fun makeRetrofitService(): RetrofitService {
        return Retrofit.Builder()
            .baseUrl("https://renta-motos.onrender.com/zynch/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RetrofitService::class.java)
    }
}