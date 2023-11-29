package com.example.chilis.Service;

import com.example.chilis.Entity.Claim;
import com.example.chilis.IService.IClaimService;
import com.example.chilis.Repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClaimServiceImpl implements IClaimService {
    @Autowired
    ClaimRepository claimRepository;
    @Override
    public Claim addClaim(Claim claim) {
        return claimRepository.save(claim);
    }

    @Override
    public void removeClaim(Integer idClaim) {
        claimRepository.deleteById(idClaim);
    }

    @Override
    public Claim retreiveClaim(Integer idClaim) {
        return claimRepository.findById(idClaim).get();
    }

    @Override
    public List<Claim> retreiveAllClaim() {
        return claimRepository.findAll();
    }
}
