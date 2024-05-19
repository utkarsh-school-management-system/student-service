package xyz.utkarshgoyal.studentservice.service;

import xyz.utkarshgoyal.studentservice.entity.Student;

import java.util.List;

public interface StudentService {

    Student add(Student student);
    Student get(Long id);
    List<Student> get();
    List<Student> getStudentsBySchoolId(Long schoolId);
}
