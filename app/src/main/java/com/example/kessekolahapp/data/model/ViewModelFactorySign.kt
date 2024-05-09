package com.example.kessekolahapp.data.model

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kessekolahapp.data.model.LoginViewModel
//import com.example.kessekolahapp.ui.sign.signUp.CompleteProfileViewModel
//import com.example.kessekolahapp.ui.sign.signUp.SignUpViewModel

class ViewModelFactorySign private constructor(private val mApplication: Application) : ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var INSTANCE: ViewModelFactorySign? = null

        @JvmStatic
        fun getInstance(application: Application): ViewModelFactorySign {
            if (INSTANCE == null) {
                synchronized(ViewModelFactorySign::class.java) {
                    INSTANCE = ViewModelFactorySign(application)
                }
            }
            return INSTANCE as ViewModelFactorySign
        }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(SignUpViewModel::class.java)) {
//            return SignUpViewModel(mApplication) as T
//        }
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(mApplication) as T
        }
//        if (modelClass.isAssignableFrom(CompleteProfileViewModel::class.java)) {
//            return CompleteProfileViewModel(mApplication) as T
//        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}