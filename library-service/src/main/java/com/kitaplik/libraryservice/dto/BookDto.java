package com.kitaplik.libraryservice.dto;

public record BookDto(

        BookIdDto id,
        String title,
        int year,
        String author,
        String pressName
){
}
