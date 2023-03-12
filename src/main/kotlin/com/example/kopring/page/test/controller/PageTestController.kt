package com.example.kopring.page.test.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam


@RequestMapping("/test")
@Controller
class PageTestController {

    val log: Logger = LoggerFactory.getLogger(this.javaClass)

    @RequestMapping("/page")
    fun page(@RequestParam input: String): String {
        log.debug("INPUT: {}", input)
        return "test/index"
    }

}