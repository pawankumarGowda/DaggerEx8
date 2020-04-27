package com.example.mvvmdagger.network.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdagger.MyRetroApplication
import com.example.mvvmdagger.network.di.APIComponent
import com.example.mvvmdagger.network.di.APIModule
import com.example.mvvmdagger.network.di.DaggerAPIComponent
import com.example.mvvmdagger.network.repository.APIURL
import com.example.mvvmdagger.network.repository.RetrofitRepository
import javax.inject.Inject

class RetroViewModelFactory : ViewModelProvider.Factory {
    lateinit var apiComponent: APIComponent
    @Inject
    lateinit var retrofitRepository: RetrofitRepository

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
           //initDaggerComponent()
        var apiComponent :APIComponent =  MyRetroApplication.apiComponent
        apiComponent.inject(this)
        if (modelClass.isAssignableFrom(RetroViewModel::class.java)) {
            return RetroViewModel(retrofitRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
    fun initDaggerComponent(){
        apiComponent =   DaggerAPIComponent
            .builder()
            .aPIModule(APIModule(APIURL.BASE_URL))
            .build()
        apiComponent.inject(this)
    }
}