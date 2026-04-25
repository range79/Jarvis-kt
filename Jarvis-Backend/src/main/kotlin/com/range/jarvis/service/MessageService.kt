package com.range.jarvis.service

import com.range.jarvis.domain.entity.Message
import org.springframework.data.domain.Page

interface MessageService {
    fun findSameMessage(msg: String): Page<Message>
}