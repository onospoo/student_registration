package com.qqqq.student_registration.controller.impl

import com.qqqq.student_registration.controller.StudentController
import com.qqqq.student_registration.dto.Student
import com.qqqq.student_registration.model.entity.StudentEntity
import com.qqqq.student_registration.service.StudentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController


@RestController
class StudentControllerImpl(
        private val studentService: StudentService
) : StudentController {

    override fun createStundent(student: Student): ResponseEntity<Long> =
            ResponseEntity.ok(studentService.createStudent(student))

    override fun getStudentById(id: Long): ResponseEntity<StudentEntity> =
            ResponseEntity.ok(studentService.getStudentById(id))

    override fun getListOfStudents(): ResponseEntity<List<StudentEntity>> =
            ResponseEntity.ok(studentService.getStudentsList())

    override fun editStudentInfo(id: Long, student: Student): ResponseEntity<StudentEntity> =
            ResponseEntity.ok(studentService.editStudent(id, student))

    override fun removeStudent(id: Long) =
            ResponseEntity.ok(studentService.removeStudent(id))

}