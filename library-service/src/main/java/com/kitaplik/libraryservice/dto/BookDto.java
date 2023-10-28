package com.kitaplik.libraryservice.dto;

public record BookDto(

        BookIdDto id,
        String title,
        int bookYear,
        String author,
        String pressName
){
}
