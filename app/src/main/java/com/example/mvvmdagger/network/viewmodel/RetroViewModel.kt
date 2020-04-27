package com.example.mvvmdagger.network.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmdagger.network.model.PostInfo
import com.example.mvvmdagger.network.repository.RetrofitRepository

class RetroViewModel(retrofitRepository: RetrofitRepository): ViewModel() {
    lateinit var retrofitRepository:RetrofitRepository
    var postInfoLiveData: LiveData<List<PostInfo>> = MutableLiveData()

    init {
        this.retrofitRepository  = retrofitRepository
        fetchPostInfoFromRepository()
    }

    fun fetchPostInfoFromRepository(){
        postInfoLiveData =  retrofitRepository.fetchPostInfoList()
    }
}