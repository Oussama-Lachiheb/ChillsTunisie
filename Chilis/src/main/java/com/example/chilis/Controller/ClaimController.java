package com.example.chilis.Controller;

import com.example.chilis.Entity.Claim;
import com.example.chilis.Service.ClaimServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/claim")
@CrossOrigin(origins = "*")
@Tag(name = "Claim Management")
public class ClaimController {
    @Autowired
    ClaimServiceImpl claimService;

    @Operation(description = "Add Claim")
    @PostMapping("addClaim")
    public Claim addPlat(@RequestBody Claim claim) {
        return claimService.addClaim(claim);
    }

    @Operation(description = "Retrieve Claim")
    @GetMapping("retrieveClaim/{IdClaim}")
    public Claim retrieveClaim(@PathVariable Integer IdClaim) {
        return claimService.retreiveClaim(IdClaim);
    }
    @Operation(description = "Remove Claim")
    @DeleteMapping("RemoveClaim/{IdClaim}")
    public void removeClaim(@PathVariable Integer IdClaim) {
         claimService.removeClaim(IdClaim);
    }
    @Operation(description = "Retrieve All Claim")
    @GetMapping("retrieveAllClaim")
    public List<Claim> retrieveAllClaim() {
        return claimService.retreiveAllClaim();
    }
}
