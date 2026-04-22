package com.range.jarvis.domain.repository

import com.range.jarvis.domain.entity.MessageAnswer
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface MessageAnswerRepository: JpaRepository<MessageAnswer, UUID> {
}