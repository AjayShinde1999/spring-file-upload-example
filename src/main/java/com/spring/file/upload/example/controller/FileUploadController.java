package com.spring.file.upload.example.controller;

import com.spring.file.upload.example.model.FileUpload;
import com.spring.file.upload.example.service.FileUploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/files")
public class FileUploadController {

    private final FileUploadService fileUploadService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            FileUpload fileUpload = fileUploadService.storeFile(file);
            return "File uploaded successfully with ID: " + fileUpload.getId();
            //return ResponseEntity.status(HttpStatus.OK).body("File uploaded successfully with ID: " + fileUpload.getId());
        } catch (Exception e) {
            return "Failed to upload the file";
        }
    }

}
