package app.JavaFxTeacherApplication.repository;

import app.JavaFxTeacherApplication.Teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {}
