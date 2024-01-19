//package io.java.service;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//public interface TodoService {
//    Optional<Todo> save(final Todo todo);
//    Optional<Page<Todo>> findAll(final Pageable pageable);
//    Optional<Page<Todo>> findAllByTask(final String task, final Pageable pageable);
//    Optional<List<Todo>> findAll();
//    Optional<Todo> findByUuid(final UUID uuid);
//}
