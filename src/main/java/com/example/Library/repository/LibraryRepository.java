package com.example.Library.repository;
import com.example.Library.model.ClassBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


@NoRepositoryBean
public interface LibraryRepository<T extends ClassBase<T>> extends JpaRepository<T, Long>{

}
