package com.qqqq.student_registration.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.factory.PasswordEncoderFactories


@Configuration
@EnableWebSecurity
class SecurityConfig : WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity?) {
        http!!
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic()
                .and()
                .csrf()
                .disable()
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        val encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder()
        auth!!
                .inMemoryAuthentication()
                .withUser("admin")
                .password(encoder.encode("admin"))
                .roles("ADMIN")
    }
}