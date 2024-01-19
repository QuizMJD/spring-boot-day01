package io.java.repository;

import io.java.model.Student;
import io.java.model.Subject;
import io.java.model.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
    Teacher save(final Teacher teacher);
    Page<Teacher> findAll(final Pageable pageable);
    List< Teacher> findAll();
    Page< Teacher> findAllByName(final String name, final Pageable pageable);
    Optional< Teacher> findById(final Long id);
}

