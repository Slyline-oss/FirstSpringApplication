package com.melihov.firstspringapplication.repositories;

import com.melihov.firstspringapplication.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
