package com.example.TDDCRUD.Repo;

import com.example.TDDCRUD.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
    // You can add custom query methods here if needed


}