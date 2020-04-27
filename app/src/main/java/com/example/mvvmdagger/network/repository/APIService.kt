package com.example.mvvmdagger.network.repository

import com.example.mvvmdagger.network.model.PostInfo
import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("posts")
    fun makeRequest(): Call<List<PostInfo>>
}