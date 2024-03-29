package com.kitaplik.libraryservice.controller;


import com.kitaplik.libraryservice.dto.AddBookRequest;
import com.kitaplik.libraryservice.dto.LibraryDto;
import com.kitaplik.libraryservice.service.LibraryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.core.env.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/v1/library")
public class LibraryController {
    Logger logger = LoggerFactory.getLogger(LibraryController.class);
    private final LibraryService libraryService;

    private final Environment environment;

    private final Integer count;
    public LibraryController(LibraryService libraryService, Environment environment, Integer count) {
        this.libraryService = libraryService;
        this.environment = environment;
        this.count = count;
    }


    @GetMapping("{id}")
    public ResponseEntity<LibraryDto> getLibraryById(@PathVariable String id){
        return ResponseEntity.ok(libraryService.getAllBookInLibraryById(id));
    }

    @PostMapping
    public ResponseEntity<LibraryDto> createLibrary(){

        logger.info("Library created on port number " + environment.getProperty("local.server.port"));
        return ResponseEntity.ok(libraryService.createLibrary());
    }

    @GetMapping
    public ResponseEntity<List<String>> getAllLibraries() {
        return ResponseEntity.ok(libraryService.getAllLibraries());
    }
    @PutMapping
    public ResponseEntity<?> addBookToLibrary(@RequestBody AddBookRequest request){

        libraryService.addBookToLibrary(request);

        return ResponseEntity.ok().build();

    }


    @GetMapping("/count")
    public String getCount() {
        return "Library service count: " + count;
    }



}
