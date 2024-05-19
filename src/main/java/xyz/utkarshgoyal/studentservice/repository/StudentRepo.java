package xyz.utkarshgoyal.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.utkarshgoyal.studentservice.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {
    Optional<List<Student>> findAllBySchoolId(Long schoolId);
}
