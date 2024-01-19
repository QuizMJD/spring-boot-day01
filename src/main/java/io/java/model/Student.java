package io.java.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity

public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private   Gender gender;
    // test
    @ManyToMany
    private List<Subject> subjects;
    //test
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Teacher>teachers;
    private Long score;


}
