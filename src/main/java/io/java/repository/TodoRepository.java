//package io.java.repository;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//@Repository
//public interface TodoRepository extends JpaRepository<Todo, UUID> {
//    Todo save(final Todo todo);
//    Page<Todo> findAll(final Pageable pageable);
//    List<Todo> findAll();
//    Page<Todo> findAllByTodo(final String todo, final Pageable pageable);
//    Optional<Todo> findById(final UUID id);
//}
