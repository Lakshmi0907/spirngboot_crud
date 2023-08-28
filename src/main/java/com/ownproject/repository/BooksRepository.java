package com.ownproject.repository;

import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository added text
import com.ownproject.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {
}
