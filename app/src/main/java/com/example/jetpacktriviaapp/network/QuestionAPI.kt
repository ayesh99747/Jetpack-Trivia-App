package com.example.jetpacktriviaapp.network

import com.example.jetpacktriviaapp.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionAPI {
    @GET("world.json")
    suspend fun getAllQuestions() : Question
}