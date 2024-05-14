package com.example.TDDCRUD.models;

import com.example.TDDCRUD.Repo.TagRepository;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "widgets")
public class Widget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany
    @JoinTable(
            name = "taggables",
            joinColumns = @JoinColumn(name = "widget_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private Set<Tag> tags = new HashSet<>();

    // Constructors, getters, and setters
}

