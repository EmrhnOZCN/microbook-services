package com.kitaplik.libraryservice.dto;

import com.kitaplik.libraryservice.model.Library;

import java.util.ArrayList;
import java.util.List;

public record LibraryDto (
        String id,
        List<BookDto> userBookList
){
    public LibraryDto(String id) {
        this(id, new ArrayList<>());
    }
}
