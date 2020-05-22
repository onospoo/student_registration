package com.qqqq.student_registration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class StudentRegistrationApplication

fun main(args: Array<String>) {
    runApplication<StudentRegistrationApplication>(*args)
}
