package com.example.binlist.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.binlist.data.API
import com.example.binlist.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        setUpRecyclerview()
    }

    private fun setUpRecyclerview() {
        val adapter = AdapterRV()
        with(binding) {
            rvMain.adapter = adapter
        }
    }
//    val retrofit = Retrofit.Builder()
//        .baseUrl("https://binlist.net/")
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//
//    val api = retrofit.create(API::class.java)
//
//    val call = api.getPost()
//    call.enqueue(object : Callback<List<Post>> {
//        override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
//            if (response.isSuccessful) {
//                val posts = response.body()
//                // Используйте данные
//            } else {
//                // Обработайте ошибку
//            }
//        }
//
//        override fun onFailure(call: Call<List<Post>>, t: Throwable) {
//            // Обработайте ошибку
//        }
//    })

}