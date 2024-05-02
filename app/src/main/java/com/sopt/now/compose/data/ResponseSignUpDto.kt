package com.sopt.now.compose.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseSignUpDto(
    @SerialName("code")
    val status: Int,
    @SerialName("message")
    val message: String,
)