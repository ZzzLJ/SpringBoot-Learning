package com.springboot.thymeleaf_freemarker.service;

import com.springboot.thymeleaf_freemarker.domain.Book;
import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book insertByBook(Book book);

    Book update(Book book);

    Book delete(Long id);

    Book findById(Long id);
}
