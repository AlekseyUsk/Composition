package com.bignerdranch.android.composition.domain.entity

data class Question(

    val sum: Int,
    val visibleNumber: Int,
    val option: List<Int>
)