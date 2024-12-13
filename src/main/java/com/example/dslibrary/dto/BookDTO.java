package com.example.dslibrary.dto;

import com.example.dslibrary.entities.Book;
import com.example.dslibrary.entities.Category;

public class BookDTO {

    private Long id;
    private String title;
    private String author;
    private Boolean availability;
    private CategoryDTO category;

    public BookDTO() {

    }

    public BookDTO(Long id, String title, String author, Boolean availability, CategoryDTO category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.availability = availability;
        this.category = category;
    }

    public BookDTO(Book entity) {
        id = entity.getId();
        title = entity.getTitle();
        author = entity.getAuthor();
        availability = entity.getAvailability();
        category = new CategoryDTO(entity.getCategory());
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public CategoryDTO getCategory() {
        return category;
    }
}
