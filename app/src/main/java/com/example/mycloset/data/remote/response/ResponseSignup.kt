package com.example.mycloset.data.remote.response

data class ResponseSignup (
    val timestamp : String,
    val status : Int,
    val statusDetail : String,
    val code : String,
    val message : String,
    val data : Data
        ){
    data class Data(
        val accessToken : String
    )
}