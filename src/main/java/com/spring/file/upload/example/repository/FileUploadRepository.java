package com.spring.file.upload.example.repository;

import com.spring.file.upload.example.model.FileUpload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileUploadRepository extends JpaRepository<FileUpload,Long> {
}
