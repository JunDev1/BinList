package com.example.binlist.presentation

import android.graphics.Movie
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.binlist.common.Common
import com.example.binlist.data.CardModel
import com.example.binlist.data.RetrofitService
import com.example.binlist.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.security.auth.callback.Callback

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var adapterRV: AdapterRV
    private lateinit var retrofit : Retrofit
    private lateinit var binlistAPI : RetrofitService

    lateinit var mService: RetrofitService
    lateinit var layoutManager: LinearLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        retrofit = Retrofit.Builder().baseUrl("https://lookup.binlist.net/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        binlistAPI = retrofit.create(RetrofitService::class.java)
        val binlistRequest : Call<MutableList<CardModel>> = binlistAPI.getCardInfo()
        binlistRequest.enqueue(object :
            retrofit2.Callback<MutableList<CardModel>> {
            override fun onResponse(
                call: Call<MutableList<CardModel>>,
                response: Response<MutableList<CardModel>>
            ) {
                Log.d(TAG, "Response received : ${response.body()}")
            }

            override fun onFailure(call: Call<MutableList<CardModel>>, t: Throwable) {
                Log.d(TAG, "Failed to fetch data",t)
            }

        })

//        mService = Common.retrofitService
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }

//    private fun setUpRecyclerView() {
//        with(binding.rvMain) {
//            adapterRV = AdapterRV()
//            adapter = adapterRV
//        }
//
//    }
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