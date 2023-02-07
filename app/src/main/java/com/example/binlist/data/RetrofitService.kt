package com.example.binlist.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface RetrofitService {
    @GET("/45717360")
    fun getCardInfo(): Call<MutableList<CardModel>>
}