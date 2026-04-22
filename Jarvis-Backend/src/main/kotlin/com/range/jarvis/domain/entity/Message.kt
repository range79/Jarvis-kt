package com.range.jarvis.domain.entity

import jakarta.persistence.*
import java.time.Instant
import java.util.*

@Entity
@Table(name = "chat")
class Message(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null,
    var message: String,
    var askedAt: Instant = Instant.now(),
    var messageOwner: MessageOwner,
    var answerType: AnswerType,
)