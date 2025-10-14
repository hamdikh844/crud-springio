package com.example.livres.controlers;

import com.example.livres.services.LivreService;
import com.example.livres.entity.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livres")
public class LivreControler {

    @Autowired
    private LivreService service;
    @PostMapping("/zid")
    public Livre addLivre(@RequestBody Livre livre) {
        return service.saveLivre(livre);
    }


    @PostMapping("/addlivres")
    public List<Livre> addLivres(@RequestBody List<Livre> livres) {
        return service.saveLivre(livres);
    }


    @GetMapping("/all")
    public List<Livre> getAllLivres() {
        return service.getlivres();
    }


    @DeleteMapping("/delete/{id}")
    public String deleteLivre(@PathVariable int id) {
        service.deleteliver(id);
        return "Livre supprimé avec succès (ID = " + id + ")";
    }
}
