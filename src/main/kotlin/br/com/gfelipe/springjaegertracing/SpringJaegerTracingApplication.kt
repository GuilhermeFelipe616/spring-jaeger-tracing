package br.com.gfelipe.springjaegertracing

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class SpringJaegerTracingApplication

fun main(args: Array<String>) {
	runApplication<SpringJaegerTracingApplication>(*args)
}
