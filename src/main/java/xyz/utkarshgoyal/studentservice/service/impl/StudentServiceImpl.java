package xyz.utkarshgoyal.studentservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.utkarshgoyal.studentservice.entity.Student;
import xyz.utkarshgoyal.studentservice.repository.StudentRepo;
import xyz.utkarshgoyal.studentservice.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public Student add(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student get(Long id) {
        return studentRepo.findById(id).orElseThrow(() -> new RuntimeException("Student not found for id :" + id.toString()));
    }

    @Override
    public List<Student> get() {
        return studentRepo.findAll();
    }

    @Override
    public List<Student> getStudentsBySchoolId(Long schoolId) {
        return studentRepo.findAllBySchoolId(schoolId).orElseThrow(() -> new RuntimeException("Please provide correct school id"));
    }

}
