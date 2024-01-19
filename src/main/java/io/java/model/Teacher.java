package io.java.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Teacher {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    private String name;
    private String subject;


}
