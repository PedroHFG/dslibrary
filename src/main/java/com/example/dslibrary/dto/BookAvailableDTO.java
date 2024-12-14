package com.example.dslibrary.dto;

import com.example.dslibrary.entities.Book;
import com.example.dslibrary.projections.BookAvailableProjection;

public class BookAvailableDTO {

    private String title;
    private String author;
    private String category;

    public BookAvailableDTO() {

    }

    public BookAvailableDTO(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public BookAvailableDTO(BookAvailableProjection projection) {
        this.title = projection.getTitle();
        this.author = projection.getAuthor();
        this.category = projection.getCategory();
    }

    public BookAvailableDTO(Book entity) {
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.category = entity.getCategory().getName();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }
}
