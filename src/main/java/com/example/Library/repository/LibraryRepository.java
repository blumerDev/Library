package com.example.Library.repository;
import com.example.Library.model.ClassBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface LibraryRepository<T extends ClassBase,id extends Serializable> extends JpaRepository<T, Long>{

}

