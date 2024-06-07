package com.sopt.now.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RequestPasswordDto(
    @SerialName("previousPassword")
    val previousPassword: String,
    @SerialName("newPassword")
    val newPassword: String,
    @SerialName("newPasswordVerification")
    val newPasswordVerification: String
)