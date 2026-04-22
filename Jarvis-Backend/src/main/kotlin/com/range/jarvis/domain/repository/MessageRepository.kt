package com.range.jarvis.domain.repository

import com.range.jarvis.domain.entity.Message
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface MessageRepository: JpaRepository<Message, UUID> {
}