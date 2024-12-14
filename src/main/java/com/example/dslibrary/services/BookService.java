package com.example.dslibrary.services;

import com.example.dslibrary.dto.BookAvailableDTO;
import com.example.dslibrary.dto.BookDTO;
import com.example.dslibrary.entities.Book;
import com.example.dslibrary.projections.BookAvailableProjection;
import com.example.dslibrary.repositories.BookRepository;
import com.example.dslibrary.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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

    public Page<BookAvailableDTO> getAvailableBooks(String title, String author, Pageable pageable) {
        Page<BookAvailableProjection> list = repository.getAvailableBooks(title, author, pageable);
        return list.map(x -> new BookAvailableDTO(x));
    }
}
