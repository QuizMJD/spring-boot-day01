package io.java.service.impl;

import io.java.model.Student;
import io.java.repository.StudentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class StudentService implements io.java.service.StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Optional<Student> save(final Student student) {
        return Optional.of(this.studentRepository.save(student));
    }

    @Override
    public Optional<Page<Student>> findAll(final Pageable pageable) {
        return Optional.of(this.studentRepository.findAll(
                PageRequest.of(
                        pageable.getPageNumber(),
                        pageable.getPageSize())));
    }

    @Override
    public Optional<Page<Student>> findAllByName(final String name, final Pageable pageable) {
        return Optional.of(this.studentRepository.findAllByName(name,
                PageRequest.of(
                        pageable.getPageNumber(),
                        pageable.getPageSize())));
    }

    @Override
    public Optional<List<Student>> findAll() {
        return Optional.of(this.studentRepository.findAll());
    }

    @Override
    public Optional<Student> findById(final Long id) {
        return Optional.of(this.studentRepository.findById(id).orElseThrow(RuntimeException::new));
    }
}
