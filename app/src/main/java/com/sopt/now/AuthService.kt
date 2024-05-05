package com.sopt.now

import com.sopt.now.dataClass.RequestLogInDto
import com.sopt.now.dataClass.RequestPasswordDto
import com.sopt.now.dataClass.RequestSignUpDto
import com.sopt.now.dataClass.ResponseDto
import com.sopt.now.dataClass.ResponseInfoDto
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST

interface AuthService {
    @POST("member/join")
    fun signUp(
        @Body request: RequestSignUpDto,
    ): Call<ResponseDto>

    @POST("member/login")
    fun login(@Body request: RequestLogInDto): Call<ResponseDto>

    @GET("member/info")
    fun info(@Header("memberId") memberId: Int): Call<ResponseInfoDto>

    @PATCH("member/password")
    fun changePassword(
        @Header("memberId") memberId: Int,
        @Body request: RequestPasswordDto
    ): Call<ResponseDto>
}