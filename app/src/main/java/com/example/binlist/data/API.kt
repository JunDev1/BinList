package com.example.binlist.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface API {
    @GET("posts")
    fun getPost(): Call<List<POST>>
}