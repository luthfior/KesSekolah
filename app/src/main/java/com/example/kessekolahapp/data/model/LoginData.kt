package com.example.kessekolahapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginData(
    var username: String?,
    var nama: String?,
    var email: String?,
    var phoneNumber: String?,
    var token: String?,
    var createdAt: String? = null
):Parcelable
