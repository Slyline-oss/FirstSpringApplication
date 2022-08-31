package com.melihov.firstspringapplication.repositories;

import com.melihov.firstspringapplication.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
