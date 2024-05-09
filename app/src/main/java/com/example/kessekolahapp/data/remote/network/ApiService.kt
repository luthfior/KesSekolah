package com.example.kessekolahapp.data.remote.network

import com.example.kessekolahapp.data.response.LoginResponse
import com.example.kessekolahapp.data.response.SignUpResponse
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {

    @Multipart
    @POST("/login")
    suspend fun login(
        @Part("email") email: String,
        @Part("password") password: String
    ) : LoginResponse

    @Multipart
    @POST("/signup")
    suspend fun signUp(
        @Part("phone_number") phoneNumber: String,
        @Part("username") username: String,
        @Part("password") password: String,
        @Part("confirm_password") confirmPassword: String
    ) : SignUpResponse
}