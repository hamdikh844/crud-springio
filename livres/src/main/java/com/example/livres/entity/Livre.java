package com.example.livres.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor
//@Getter
//@Setter
@Entity
@Table(name = "liver")
public class Livre {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)

    private Integer id;
    @ManyToOne
    @JoinColumn(name = "library_id",referencedColumnName = "id")
    private Library library;




    private String title;

    private String author;


    @Column(name = "serial_number")
    private Integer serialNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", library=" + library +
                ", serialNumber=" + serialNumber +
                '}';
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

}

