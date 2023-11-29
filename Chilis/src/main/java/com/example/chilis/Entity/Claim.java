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
@Table( name = "Claim")
public class Claim implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClaim")
    private Integer idClaim;
    @Column(name = "claim_name")
    private String name;
    @Column(name = "claim_email")
    private String email;
    @Column(name = "claim_msg")
    private String message;
}
