package com.example.dslibrary.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_user_book")
public class UserBook {

    @EmbeddedId
    private UserBookPK id = new UserBookPK();
    private LocalDate loanDate;
    private LocalDate returnDate;

    public UserBook(User user, Book book, LocalDate loanDate, LocalDate returnDate) {
        id.setUser(user);
        id.setBook(book);
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public User getUser() {
        return id.getUser();
    }

    public void setUser(User user) {
        id.setUser(user);
    }

    public Book getBook() {
        return id.getBook();
    }

    public void setBook(Book book) {
        id.setBook(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserBook userBook = (UserBook) o;
        return Objects.equals(id, userBook.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
