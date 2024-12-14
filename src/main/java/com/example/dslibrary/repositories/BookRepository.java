package com.example.dslibrary.repositories;

import com.example.dslibrary.entities.Book;
import com.example.dslibrary.projections.BookAvailableProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {

    @Query(nativeQuery = true, value = """
            SELECT tb_book.title, tb_book.author, tb_category.name AS category
            FROM tb_book
            INNER JOIN tb_category
            ON tb_book.category_id = tb_category.id
            WHERE tb_book.availability=true
            AND UPPER(tb_book.title) LIKE UPPER(CONCAT('%', :title, '%'))
            AND UPPER(tb_book.author) LIKE UPPER(CONCAT('%', :author, '%'))
            """,
    countQuery = """
            SELECT tb_book.title, tb_book.author, tb_category.name AS category
            FROM tb_book
            INNER JOIN tb_category
            ON tb_book.category_id = tb_category.id
            WHERE tb_book.availability=true
            AND UPPER(tb_book.title) LIKE UPPER(CONCAT('%', :title, '%'))
            AND UPPER(tb_book.author) LIKE UPPER(CONCAT('%', :author, '%'))
            """)
    Page<BookAvailableProjection> getAvailableBooks(String title, String author, Pageable pageable);
}
