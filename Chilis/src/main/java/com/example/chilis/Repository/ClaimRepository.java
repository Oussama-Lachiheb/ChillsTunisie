package com.example.chilis.Repository;

import com.example.chilis.Entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepository extends JpaRepository<Claim,Integer> {
}
