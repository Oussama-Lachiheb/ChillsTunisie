package com.example.chilis.Controller;
import com.example.chilis.Entity.Plat;
import com.example.chilis.Service.PlatServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;


@RestController
@RequestMapping("/plat")
@CrossOrigin(origins = "*")
@Tag(name = "Plat Management")
public class PlatController {
    @Autowired
    PlatServiceImpl platService;

    @Operation(description = "Add Plat")
    @PostMapping("addPlat")
    public ResponseEntity<Plat> addPlat(@ModelAttribute Plat plat, @RequestParam("imageFile") MultipartFile imageFile) throws Exception {
        Plat addedPlat = platService.addPlat(plat, imageFile);
        return ResponseEntity.ok(addedPlat);
    }

    @Operation(description = "Update Plat")
    @PutMapping("updatePlat")
    public Plat updatePlat(@ModelAttribute Plat plat, @RequestParam("imageFile") MultipartFile imageFile) throws Exception {
        return platService.updatePlat(plat,imageFile);
    }
    @Operation(description = "Retrieve Plat")
    @GetMapping("retreivePlat/{idPlat}")
    public Plat retreivePlat(@PathVariable Integer idPlat){
        return platService.retreivePlat(idPlat);
    }
    @Operation(description = "Remove Plat")
    @DeleteMapping("removePlat/{idPlat}")
    public void removePlat(@PathVariable Integer idPlat){
         platService.removePlat(idPlat);
    }

    @Operation(description = "Retrieve all Plat")
    @GetMapping("RetrieveAllPlat")
    public List<Plat> retreiveAllPlat(){
       return platService.retreiveAllPlat();
    }
}
