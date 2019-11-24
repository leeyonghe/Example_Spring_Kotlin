package com.lee.kr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExampleSpringKotlinApplication

fun main(args: Array<String>) {
	runApplication<ExampleSpringKotlinApplication>(*args)
}
