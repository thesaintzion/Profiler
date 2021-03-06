package com.lekkiforum.profilerapp.Services

import com.lekkiforum.profilerapp.Models.TestModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TodoService {

    @GET("/todos")
    fun getTodos(): Call<TestModel>
}