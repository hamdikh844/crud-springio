package com.example.livres.controlers;

import com.example.livres.Repositories.LivreRipositories;
import com.example.livres.services.LivreService;
import com.example.livres.entity.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livres")
public class LivreControler {

    @Autowired
    private LivreService service;

    @PostMapping("/zid")
    @ResponseStatus(HttpStatus.CREATED)
    public void addLivre(@RequestBody Livre livre) {
         service.saveLivre(livre);
    }


    @GetMapping("/all")
    public ResponseEntity<List<Livre>> getAllLivres() {
        return ResponseEntity.ok(service.getlivres());
    }

    @GetMapping("/One/{id}")
    public ResponseEntity<Livre> getOneLivre(@PathVariable int id) {
        return ResponseEntity.ok(service.getlivrebyId(id));
    }


    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<String> deleteLivre(@PathVariable int id) {
        if (!service.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        service.deletelivre(id); // Fixed typo: "deleteliver" → "deletelivre"
        return ResponseEntity.ok("livre deleted successfully (ID = " + id + ")");
    }



    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<Livre> updateLivre(@PathVariable int id, @RequestBody Livre newLivre) {
        Livre result = service.updateLivre(id, newLivre);
        if (result != null) {
            return ResponseEntity.ok(result);
        }

        return null;
    }




    // UserService.java

    }



