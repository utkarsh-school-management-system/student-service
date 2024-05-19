package xyz.utkarshgoyal.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.utkarshgoyal.studentservice.entity.Student;
import xyz.utkarshgoyal.studentservice.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public Student add(@RequestBody Student student) {
        return studentService.add(student);
    }

    @GetMapping("/{id}")
    public Student get(@PathVariable Long id) { return studentService.get(id); }

    @GetMapping
    public List<Student> getAll() {return studentService.get(); }

    @GetMapping("/school/{schoolId}")
    public List<Student> getStudentsBySchoolId(@PathVariable Long schoolId) { return studentService.getStudentsBySchoolId(schoolId); }

}
