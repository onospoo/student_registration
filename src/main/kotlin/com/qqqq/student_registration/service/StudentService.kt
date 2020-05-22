package com.qqqq.student_registration.service

import com.qqqq.student_registration.dto.Student
import com.qqqq.student_registration.model.entity.StudentEntity


interface StudentService {

    fun createStudent(student: Student) : Long

    fun getStudentById(id: Long) : StudentEntity

    fun getStudentsList() : List<StudentEntity>

    fun editStudent(id: Long, student: Student) : StudentEntity

    fun removeStudent(id: Long) : Long
}