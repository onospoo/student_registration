package com.qqqq.student_registration.model.repository

import com.qqqq.student_registration.model.entity.StudentEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface StudentRepository : CrudRepository<StudentEntity, Long> {
}