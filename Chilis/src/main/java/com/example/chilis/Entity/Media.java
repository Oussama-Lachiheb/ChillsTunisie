package com.example.chilis.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table( name = "Media")
public class Media implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Media_id")
    private Integer id;
    @Column(name = "Media_url")
    private String imageUrl;
    public Media(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
