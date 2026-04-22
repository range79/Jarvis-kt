package com.range.jarvis.domain.entity

import com.range.jarvis.dto.AnswerType
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "message_answer")
 class MessageAnswer (
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID?=null,
    var answer: String,
    @Enumerated(EnumType.STRING)
    var answerType: AnswerType
)