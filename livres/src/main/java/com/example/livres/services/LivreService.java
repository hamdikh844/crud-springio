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

    public List<Livre> getlivres() {
        return livreRipositories.findAll();
    }

    public boolean existsById(int id) {
        return livreRipositories.existsById(id);
    }

    public Livre getlivrebyId(int id) {
        return livreRipositories.getById(id);

    }


    public void deletelivre(int id) {
        livreRipositories.deleteById(id);
    }

    public Livre updateLivre(Integer id, Livre updatedLivre) {
        Livre existingLivre = livreRipositories.findById(id).orElse(null);

        if (existingLivre != null) {
            existingLivre.setTitle(updatedLivre.getTitle());
            existingLivre.setAuthor(updatedLivre.getAuthor());
            existingLivre.setSerialNumber(updatedLivre.getSerialNumber());
            existingLivre.setLibrary(updatedLivre.getLibrary());
            return livreRipositories.save(existingLivre);
        }

        return null;
    }
}
