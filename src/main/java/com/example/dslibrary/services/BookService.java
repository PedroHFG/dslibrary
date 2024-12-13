package com.example.dslibrary.services;

import com.example.dslibrary.dto.BookDTO;
import com.example.dslibrary.entities.Book;
import com.example.dslibrary.repositories.BookRepository;
import com.example.dslibrary.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    @Transactional(readOnly = true)
    public BookDTO findById(Long id) {
        Book book = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new BookDTO(book);
    }
}
