package com.example.chilis.IService;
import com.example.chilis.Entity.Claim;
import java.util.List;

public interface IClaimService {
    public Claim addClaim(Claim Claim);
    public void removeClaim(Integer idClaim);
    public Claim retreiveClaim(Integer idClaim);
    List<Claim> retreiveAllClaim();
}
