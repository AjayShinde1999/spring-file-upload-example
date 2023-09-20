package com.spring.file.upload.example.service;

import com.spring.file.upload.example.model.FileUpload;
import com.spring.file.upload.example.repository.FileUploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileUploadService {

    @Autowired
    private FileUploadRepository fileUploadRepository;

    public FileUpload storeFile(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FileUpload fileEntity = new FileUpload();
        fileEntity.setFileName(fileName);
        fileEntity.setFileType(file.getContentType());
        fileEntity.setData(file.getBytes());
        return fileUploadRepository.save(fileEntity);
    }

}
