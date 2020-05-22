package com.qqqq.student_registration.dto

import io.swagger.annotations.ApiModelProperty
import java.time.LocalDate


data class Student(

        @ApiModelProperty("Имя")
        var firstName: String?,

        @ApiModelProperty("Фамилия")
        var lastName: String?,

        @ApiModelProperty("Отчество")
        var middleName: String?,

        @ApiModelProperty("Дата рождения")
        var dateOfBirth: LocalDate?,

        @ApiModelProperty("Группа")
        var group: String?


)