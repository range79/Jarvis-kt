package com.range.jarvis.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table
import java.util.Date
import java.util.UUID

@Entity
@Table(name = "chat")
data class MessageHistory (
    var id: UUID,
    var message: String,
    var timestamp: Date = Date(),
)