package com.example.livres.services;

import com.example.livres.Repositories.LivreRipositories;
import com.example.livres.entity.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreService {
    @Autowired
    private LivreRipositories livreRipositories;
    public Livre saveLivre(Livre livre) {
        return livreRipositories.save(livre);
    }
    public List<Livre> saveLivre(List<Livre> livres) {
        return livreRipositories.saveAll(livres);

    }
    public List<Livre> getlivres() {
        return livreRipositories.findAll();
    }
    public void deleteliver(int id ){
        livreRipositories.deleteById(id);
    }








}
