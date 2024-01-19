package io.java.repository;

import io.java.model.Student;
import io.java.model.Subject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
@Repository
public interface SubjectRepostitory extends JpaRepository<Subject, Long> {
    Subject save(final Subject subject);
    Page< Subject> findAll(final Pageable pageable);
    List< Subject> findAll();
    Page< Subject> findAllByName(final String name, final Pageable pageable);
    Optional< Subject> findById(final Long id);
}
