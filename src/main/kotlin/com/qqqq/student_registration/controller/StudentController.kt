package com.qqqq.student_registration.controller

import com.qqqq.student_registration.dto.Student
import com.qqqq.student_registration.model.entity.StudentEntity
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RequestMapping("/student")
@RestController
interface StudentController {

    @ApiOperation("Регистрация нового студента")
    @PostMapping("/create")
    fun createStundent(

            @ApiParam("Информация о студенте")
            @RequestBody(required = true)
            student: Student
    ) : ResponseEntity<Long>

    @ApiOperation("Загрузка информации о студенте по ID")
    @GetMapping("/{id}")
    fun getStudentById(
            @ApiParam("ID студента")
            @PathVariable(name = "id", required = true)
            id: Long
    ) : ResponseEntity<StudentEntity>

    @ApiOperation("Загрузка списка студентов")
    @GetMapping("/list")
    fun getListOfStudents() : ResponseEntity<List<StudentEntity>>

    @ApiOperation("Редактирование информации студента")
    @PutMapping("/{id}/edit")
    fun editStudentInfo(
            @ApiParam("ID студента")
            @PathVariable(name = "id", required = true)
            id: Long,

            @ApiParam("Измененная информация")
            @RequestBody(required = true)
            student: Student
    ) : ResponseEntity<StudentEntity>

    @ApiOperation("Удаление студента из жизни")
    @DeleteMapping("/{id}/remove")
    fun removeStudent(
            @ApiParam("ID студента")
            @PathVariable(name = "id", required = true)
            id: Long
    ) : ResponseEntity<Long>

}