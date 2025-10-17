package com.example.livres.services;


import com.example.livres.Repositories.LibraryRipository;
import com.example.livres.entity.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
    @Autowired
    private LibraryRipository libraryRipository;
    public List<Library> getAllLibraries(){
        return libraryRipository.findAll();
    }

    public Library saveLibrary(Library library){
        return libraryRipository.save(library);
    }

    public Optional<Library> getLibrarybyId(int id){
        return libraryRipository.findById(id);
    }


    public void deleteLibrary(int id) {
        libraryRipository.deleteById(id);
    }
}
