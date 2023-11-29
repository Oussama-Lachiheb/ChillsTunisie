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
@Table( name = "Plat")
public class Plat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlat")
    private Integer idPlat;
    @Column(name = "Plat_name")
    private String name;
    @Column(name = "Plat_price")
    private float price;
    @JoinColumn(name = "media_id")
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Media image;

}
