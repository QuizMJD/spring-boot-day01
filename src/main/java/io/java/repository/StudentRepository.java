package io.java.repository;

import io.java.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student save(final Student student);
    Page<Student> findAll(final Pageable pageable);
    List<Student> findAll();
    Page<Student> findAllByName(final String name, final Pageable pageable);
    Optional<Student> findById(final Long id);
}
