package io.java.service;

import io.java.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentService {
    Optional<Student> save(final Student student);
    Optional<Page<Student>> findAll(final Pageable pageable);
    Optional<Page<Student>> findAllByName(final String name, final Pageable pageable);
    Optional<List<Student>> findAll();
    Optional<Student> findById(final Long id);
}
