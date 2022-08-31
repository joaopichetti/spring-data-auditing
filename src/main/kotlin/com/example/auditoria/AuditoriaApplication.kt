package com.example.auditoria

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class AuditoriaApplication

fun main(args: Array<String>) {
	runApplication<AuditoriaApplication>(*args)
}
