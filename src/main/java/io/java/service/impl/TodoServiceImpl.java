//package io.java.service.impl;
//
//import io.java.repository.TodoRepository;
//import io.java.service.TodoService;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//@Service
//@Transactional
//public class TodoServiceImpl implements TodoService {
//    private final TodoRepository todoRepository;
//
//    public TodoServiceImpl(TodoRepository todoRepository) {
//        this.todoRepository = todoRepository;
//    }
//
//    @Override
//    public Optional<Todo> save(final Todo todo) {
//        return Optional.of(this.todoRepository.save(todo));
//    }
//
//    @Override
//    public Optional<Page<Todo>> findAll(final Pageable pageable) {
//        return Optional.of(this.todoRepository.findAll(
//                PageRequest.of(
//                        pageable.getPageNumber(),
//                        pageable.getPageSize())));
//    }
//
//    @Override
//    public Optional<Page<Todo>> findAllByTask(final String task, final Pageable pageable) {
//        return Optional.of(this.todoRepository.findAllByTodo(
//                task,
//                PageRequest.of(
//                        pageable.getPageNumber(),
//                        pageable.getPageSize())));
//    }
//
//    @Override
//    public Optional<List<Todo>> findAll() {
//        return Optional.of(this.todoRepository.findAll());
//    }
//
//    @Override
//    public Optional<Todo> findByUuid(final UUID id) {
//        return Optional.of(this.todoRepository.findById(id).orElseThrow(RuntimeException::new));
//    }
//}
