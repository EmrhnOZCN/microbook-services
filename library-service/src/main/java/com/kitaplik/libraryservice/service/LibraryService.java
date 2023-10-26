package com.kitaplik.libraryservice.service;

import com.kitaplik.libraryservice.dto.LibraryDto;
import com.kitaplik.libraryservice.exception.LibraryNotFoundException;
import com.kitaplik.libraryservice.model.Library;
import com.kitaplik.libraryservice.repository.LibraryRepository;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {



    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }


    public LibraryDto getAllBookInLibraryById(String id){

        Library library = libraryRepository.findById(id)
                .orElseThrow(() -> new LibraryNotFoundException("Library could not found by id :" + id ));

        LibraryDto libraryDto = new LibraryDto(library.getId());

        return libraryDto;
    }


    public LibraryDto createLibrary(){
        Library newLibrary = libraryRepository.save(new Library());


        return new LibraryDto(newLibrary.getId());
    }


}
