package com.melihov.firstspringapplication.repositories;

import com.melihov.firstspringapplication.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
