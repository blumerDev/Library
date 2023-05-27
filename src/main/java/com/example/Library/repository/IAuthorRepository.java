package com.example.Library.repository;

import com.example.Library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorRepository extends JpaRepository<Author,Integer> {
}
