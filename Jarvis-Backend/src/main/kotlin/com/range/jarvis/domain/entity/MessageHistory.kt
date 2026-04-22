package com.range.jarvis.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant
import java.util.Date
import java.util.UUID

@Entity
@Table(name = "chat")
 class MessageHistory (
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null,
    var message: String,
    var askedAt: Instant = Instant.now(),
)