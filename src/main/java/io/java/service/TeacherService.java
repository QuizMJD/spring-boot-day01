package io.java.service;

import io.java.model.Student;
import io.java.model.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TeacherService {
    Optional<Teacher> save(final Teacher teacher);
    Optional<Page<Teacher>> findAll(final Pageable pageable);
    Optional<Page<Teacher>> findAllByName(final String task, final Pageable pageable);
    Optional<List<Teacher>> findAll();
    Optional<Teacher> findById(final UUID uuid);
}
