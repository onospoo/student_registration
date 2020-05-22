package com.qqqq.student_registration.model.entity

import com.qqqq.student_registration.model.BaseEntity
import java.time.LocalDate
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "students")
class StudentEntity(

        @Column(name = "first_name")
        var firstName: String = "",

        @Column(name = "last_name")
        var lastName: String = "",

        @Column(name = "middle_name")
        var middleName: String? = null,

        @Column(name = "born_date")
        var dateOfBirth: LocalDate? = null,

        @Column(name = "study_group")
        var group: String? = null

        ) : BaseEntity()