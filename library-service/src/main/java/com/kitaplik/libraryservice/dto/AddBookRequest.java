package com.kitaplik.libraryservice.dto;

public record AddBookRequest(

        String id,
        String isbn
) {
    public String getId() {
        return id;
    }

}
