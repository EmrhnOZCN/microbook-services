package com.kitaplik.bookservice.dto;

import com.kitaplik.bookservice.model.Book;

public record BookDto(BookIdDto id, String title, int bookYear, String author, String pressName) {
    public static BookDto convert(Book from) {
        BookIdDto id = (from.getId() != null) ? BookIdDto.convert(from.getId(), from.getIsbn()) : null;
        return new BookDto(id, from.getTitle(), from.getBookYear(), from.getAuthor(), from.getPressName());
    }
}
