package com.kitaplik.libraryservice.repository;

import com.kitaplik.libraryservice.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibraryRepository extends JpaRepository<Library,String> {



}
