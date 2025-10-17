package com.example.livres.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@Entity
@Table(name="library")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int id;
    private String name;
    private String location;

    @OneToMany(mappedBy = "author",orphanRemoval = true,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore

    private List<Livre> livres;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }

}
