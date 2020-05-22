package com.qqqq.student_registration.service.impl

import com.qqqq.student_registration.dto.Student
import com.qqqq.student_registration.model.entity.StudentEntity
import com.qqqq.student_registration.model.repository.StudentRepository
import com.qqqq.student_registration.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.Exception


@Service
class StudentServiceImpl(
        private val studentRepository: StudentRepository
) : StudentService {


    override fun createStudent(student: Student): Long {
        val studentEntity = StudentEntity().apply {
            this.firstName = student.firstName ?: ""
            this.lastName = student.lastName ?: ""
            this.middleName = student.middleName
            this.dateOfBirth = student.dateOfBirth
            this.group = student.group
        }
        studentRepository.save(studentEntity)

        return studentEntity.id ?: 0
    }

    override fun getStudentById(id: Long): StudentEntity {
        val studentOpt = studentRepository.findById(id)

        if( studentOpt.isPresent ) {
            return studentOpt.get()
        } else {
            throw Exception("Студента с таким ID не существует")
        }
    }

    override fun getStudentsList(): List<StudentEntity> =
            studentRepository.findAll()
                    .toList()

    override fun editStudent(id: Long, student: Student): StudentEntity {
        val studentOpt = studentRepository.findById(id)

        if (studentOpt.isPresent) {
            val editedStudent = studentOpt.get().apply {
                student.firstName?.let { this.firstName = it }
                student.lastName?.let { this.lastName = it }
                student.middleName?.let { this.middleName = it }
                student.dateOfBirth?.let { this.dateOfBirth = it }
                student.group?.let { this.group = it }
            }
            studentRepository.save(editedStudent)

            return editedStudent
        } else {
            throw Exception("Студента с таким ID не существует")
        }
    }

    override fun removeStudent(id: Long) : Long {
        studentRepository.findById(id).ifPresent {
            studentRepository.delete(it)
        }
        return id
    }

    companion object {
        private val logger = KotlinLoging.logger {}
    }
}