package com.example.kessekolahapp.data.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kessekolahapp.data.pref.AuthUser
import com.example.kessekolahapp.data.repository.AuthRepository
import com.google.firebase.auth.AuthCredential
import kotlinx.coroutines.launch

class AuthViewModel(private val authRepository: AuthRepository) : ViewModel() {
    fun getUser(): LiveData<AuthUser> = authRepository.getUser()

    fun saveUser(user: AuthUser) {
        viewModelScope.launch {
            authRepository.saveUser(user)
        }
    }

    fun userLogin(email: String, password: String) = authRepository.loginUser(email, password)

    fun userSignup(email: String, password: String) = authRepository.registerUser(email, password)

    fun googleSignIn(credential: AuthCredential) = authRepository.googleSignIn(credential)

    fun login() {
        viewModelScope.launch {
            authRepository.login()
        }
    }


    fun logout() {
        viewModelScope.launch {
            authRepository.logout()
        }
    }
}