package com.example.jetpacktriviaapp.screens

import androidx.compose.runtime.Composable
import com.example.jetpacktriviaapp.component.Questions
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun TriviaHome(viewModel: QuestionsViewModel = hiltViewModel() ) {
    Questions(viewModel)
}


