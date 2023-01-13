package com.example.mycloset.data.remote.response

data class ResponseSignin (
    val timestamp : String,
    val status : Int,
    val code : String,
    val message : String,
    val data : Data
        ){
    data class Data(
        val accessToken : String
    )
}