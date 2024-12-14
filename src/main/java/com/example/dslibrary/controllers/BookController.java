package com.example.dslibrary.controllers;

import com.example.dslibrary.dto.BookAvailableDTO;
import com.example.dslibrary.dto.BookDTO;
import com.example.dslibrary.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<BookDTO> findById(@PathVariable Long id) {
        BookDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<BookAvailableDTO>> getAvailableBooks(
            @RequestParam(name = "title", defaultValue = "") String title,
            @RequestParam(name = "author", defaultValue = "") String author,
            Pageable pageable
    ) {
        Page<BookAvailableDTO> dto = service.getAvailableBooks(title, author, pageable);
        return ResponseEntity.ok(dto);
    }

}
