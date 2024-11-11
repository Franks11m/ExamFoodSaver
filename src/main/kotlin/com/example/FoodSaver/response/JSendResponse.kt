package com.example.FoodSaver.response

data class JSendResponse(
    val status: String,
    val message: String,
    val data: Any? = null
)