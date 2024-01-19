package io.java.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity

public class Subject {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
// test

    @ManyToMany(mappedBy = "subjects")
    private List<Student> students;



}
