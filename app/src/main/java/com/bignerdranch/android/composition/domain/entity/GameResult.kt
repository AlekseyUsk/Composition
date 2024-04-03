package com.bignerdranch.android.composition.domain.entity

data class GameResult(

    val winner: Boolean,           //смайлик
    val countOfRightAnswers: Int,  //вывести результат сколько было отвеченных вопросов
    val countOfQuestions: Int,     //колличество правильных ответов
    val gameSettings: GameSettings,
)