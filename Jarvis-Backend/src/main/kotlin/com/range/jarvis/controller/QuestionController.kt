package com.range.jarvis.controller

import com.range.jarvis.domain.entity.AnswerType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class QuestionController {
    @GetMapping("/")
    fun askQuestion(@RequestBody question: String): AnswerType {
TODO()
    }
}