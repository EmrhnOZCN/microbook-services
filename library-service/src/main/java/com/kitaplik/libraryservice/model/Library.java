package com.kitaplik.libraryservice.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Library {

    @Id
    @Column(name = "library_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ElementCollection
    private List<String> userBook;


    public Library() {
        this.id = "";
        this.userBook = new ArrayList<>();
    }

    public Library(String id, List<String> userBook) {
        this.id = id;
        this.userBook = userBook;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getuserBook() {
        return userBook;
    }

    public void setuserBook(List<String> userBook) {
        this.userBook = userBook;
    }
}
