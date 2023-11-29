package com.example.chilis.IService;

import com.example.chilis.Entity.Plat;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public interface IPlatService {
    public Plat addPlat(Plat plat, MultipartFile imageFile) throws Exception;
    public Plat updatePlat(Plat plat, MultipartFile imageFile) throws Exception;
    public void removePlat(Integer idPlat);
    public Plat retreivePlat(Integer idPlat);
    List<Plat> retreiveAllPlat();


}
