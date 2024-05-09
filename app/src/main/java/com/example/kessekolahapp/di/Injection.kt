package com.example.kessekolahapp.di

import android.content.Context
import com.example.kessekolahapp.data.remote.network.ApiConfig
import com.example.kessekolahapp.data.remote.network.ApiService
import com.example.kessekolahapp.data.repository.LoginRepository

object Injection {

    var tokenUser: String = "yGo59zsvIcmjcnqilQ7sNkoiCuevrclHpkaFDIxR9Ygvth92BwgQQl2rxIZG"


    fun provideLoginRepo(context: Context) : LoginRepository{
        val service = ApiConfig.getApiService()
        return LoginRepository(service)
    }
}