package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.model.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
