package com.range.jarvis.dto

import com.range.jarvis.domain.entity.AnswerType

data class AnswerMessage (
    val answer: String,
    val answerType: AnswerType,
)