package com.example.kopring.api.test.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RequestMapping("/api-v1/test")
@RestController
class ApiTestController {

    val log: Logger = LoggerFactory.getLogger(this.javaClass)

    @RequestMapping()
    fun test(@RequestParam(required = false) input: String): String {
        return input
    }

}