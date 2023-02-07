package com.example.binlist.common

import com.example.binlist.data.RetrofitClient
import com.example.binlist.data.RetrofitService

object Common {
    private val BASE_URL = "https://lookup.binlist.net/"
    val retrofitService : RetrofitService
    get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}