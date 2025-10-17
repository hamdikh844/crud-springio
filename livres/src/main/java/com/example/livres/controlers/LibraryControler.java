package com.example.livres.controlers;

import com.example.livres.entity.Library;
import com.example.livres.services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public class LibraryControler {
    @Autowired
    LibraryService libraryService;
    @PostMapping("/addl")
    @ResponseStatus(HttpStatus.CREATED)
    public void savveLibrary(@RequestBody  Library library){
        libraryService.saveLibrary(library);



    }
    @GetMapping("/get")
    public ResponseEntity <List<Library>>getAlllibrary(){
        return ResponseEntity.ok(libraryService.getAllLibraries());
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteLibrary(@PathVariable int id) {
        libraryService.deleteLibrary(id);
    }
    









}
