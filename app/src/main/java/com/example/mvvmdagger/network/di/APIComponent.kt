package com.example.mvvmdagger.network.di

import com.example.mvvmdagger.AppModule
import com.example.mvvmdagger.network.repository.RetrofitRepository
import com.example.mvvmdagger.network.view.RetroFragment
import com.example.mvvmdagger.network.viewmodel.RetroViewModel
import com.example.mvvmdagger.network.viewmodel.RetroViewModelFactory
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [AppModule::class,APIModule::class])
interface APIComponent {
    fun inject(retrofitRepository: RetrofitRepository)
    fun inject(retroViewModel: RetroViewModel)
    fun inject(retroFragment: RetroFragment)
    fun inject(retroViewModelFactory: RetroViewModelFactory)
}