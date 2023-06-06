package com.digital.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// h2 console - http://localhost:8080/h2-console



@SpringBootApplication
class AppApplication

fun main(args: Array<String>) {
	print("Executing g .......")
	runApplication<AppApplication>(*args)
}






