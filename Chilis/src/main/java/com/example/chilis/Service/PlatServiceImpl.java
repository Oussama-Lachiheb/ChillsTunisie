package com.example.chilis.Service;

import com.example.chilis.Entity.Media;
import com.example.chilis.Entity.Plat;
import com.example.chilis.IService.IPlatService;
import com.example.chilis.Repository.MediaRepository;
import com.example.chilis.Repository.PlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class PlatServiceImpl implements IPlatService {

    @Value("${upload.path}")
    private String uploadPath;

    @Autowired
    PlatRepository platRepository;
    @Autowired
    MediaServiceImpl mediaService ;


    @Override
    public Plat addPlat(Plat plat, MultipartFile imageFile) throws Exception {
            Media media = mediaService.uploadImage(imageFile);
            plat.setImage(media);
            return platRepository.save(plat);
    }
    @Override
    public Plat updatePlat(Plat plat, MultipartFile imageFile) throws Exception {
            Media media = mediaService.uploadImage(imageFile);
            plat.setImage(media);
            return platRepository.save(plat);
    }
    @Override
    public void removePlat(Integer idPlat) {
         platRepository.deleteById(idPlat);
    }
    @Override
    public Plat retreivePlat(Integer idPlat) {
        return platRepository.findById(idPlat).get();
    }
    @Override
    public List<Plat> retreiveAllPlat() {
        return platRepository.findAll();
    }

}
