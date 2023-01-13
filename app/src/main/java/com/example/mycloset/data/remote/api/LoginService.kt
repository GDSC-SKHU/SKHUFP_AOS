package com.example.mycloset.data.remote.api

import com.example.mycloset.data.remote.request.RequestLogin
import com.example.mycloset.data.remote.response.ResponseSignin
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService  {
    // 로그인
    @POST("sign-in")
    fun postLogin(
        @Body body : RequestLogin
    ): Call<ResponseSignin>

}