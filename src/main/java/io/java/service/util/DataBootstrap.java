//package io.java.service.util;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import io.java.repository.TodoRepository;
//
//@Component
//public class DataBootstrap implements CommandLineRunner {
//    Logger logger = LoggerFactory.getLogger(DataBootstrap.class);
//    private final TodoRepository todoRepository;
//
//    public DataBootstrap(TodoRepository todoRepository) {
//        this.todoRepository = todoRepository;
//    }
//
//    @Override
//    public void run(String... args) {
//        Todo buildTodoApp = new Todo();
//        buildTodoApp.setTodo("Build Todo App");
//        buildTodoApp.setStatus(Status.IN_PROGRESS);
//        this.todoRepository.save(buildTodoApp);
//
//        Todo crud = new Todo();
//        crud.setTodo("Implement CRUD");
//        crud.setStatus(Status.IN_PROGRESS);
//        this.todoRepository.save(crud);
//
//        Todo pagination = new Todo();
//        pagination.setTodo("Implement Pagination");
//        pagination.setStatus(Status.IN_PROGRESS);
//        this.todoRepository.save(pagination);
//
//        Todo sorting = new Todo();
//        sorting.setTodo("Implement Sorting");
//        sorting.setStatus(Status.IN_PROGRESS);
//        this.todoRepository.save(sorting);
//
//        Todo basicAuth = new Todo();
//        basicAuth.setTodo("Implement Basic Auth");
//        basicAuth.setStatus(Status.IN_PROGRESS);
//        this.todoRepository.save(basicAuth);
//
//        Todo customizeWhiteLabelErrorPage = new Todo();
//        customizeWhiteLabelErrorPage.setTodo("Customize Whitelabel Error Page");
//        customizeWhiteLabelErrorPage.setStatus(Status.IN_PROGRESS);
//        this.todoRepository.save(customizeWhiteLabelErrorPage);
//
//        Todo exceptionHandling = new Todo();
//        exceptionHandling.setTodo("Implement Exceptions Handling");
//        exceptionHandling.setStatus(Status.IN_PROGRESS);
//        this.todoRepository.save(exceptionHandling);
//
//        Todo dockerize = new Todo();
//        dockerize.setTodo("Dockerize and deploy this application to Docker Hub");
//        dockerize.setStatus(Status.IN_PROGRESS);
//        this.todoRepository.save(dockerize);
//
//        Todo restExceptionHandling = new Todo();
//        restExceptionHandling.setTodo("Implement exceptions handling for RESTful APIs");
//        restExceptionHandling.setStatus(Status.IN_PROGRESS);
//        this.todoRepository.save(restExceptionHandling);
//
//        Todo generateMockData = new Todo();
//        generateMockData.setTodo("Use Java Faker or another similar mock data generating tool");
//        generateMockData.setStatus(Status.IN_PROGRESS);
//        this.todoRepository.save(generateMockData);
//
//        logger.info("Mock data loaded.\n" + this.todoRepository.findAll());
//    }
//}
