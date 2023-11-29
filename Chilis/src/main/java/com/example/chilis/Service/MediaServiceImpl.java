package com.example.chilis.Service;

import com.example.chilis.Entity.Media;
import com.example.chilis.Repository.MediaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class MediaServiceImpl {
    @Autowired
    private MediaRepository mediaRepository;

    public Media uploadImage(MultipartFile file) throws Exception {
        String filename = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        String imageUrl = saveFile(file, filename); // Implement this method to save the file and get the URL
        Media media = new Media(imageUrl);
        mediaRepository.save(media);

        return media;
    }
    private String saveFile(MultipartFile file, String filename) throws Exception {
        // Specify the directory where you want to save the uploaded files
        String uploadDir = "src/main/resources/static";

        // Resolve the absolute path of the upload directory
        Path uploadPath = Path.of(uploadDir).toAbsolutePath().normalize();

        // Create the upload directory if it doesn't exist
        Files.createDirectories(uploadPath);

        // Resolve the absolute path of the file
        Path filePath = uploadPath.resolve(filename);

        // Copy the file to the target location
        Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

        // Return the URL of the saved file
        return filePath.toString();
    }
}
