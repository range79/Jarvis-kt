package com.range.jarvis.domain.entity

import com.range.jarvis.dto.AnswerType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "message_answer")
data class MessageAnswer (
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID,
    val answer: String,
    val answerType: AnswerType
)