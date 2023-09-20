package com.spring.file.upload.example.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table
@Data
public class FileUpload {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;
    @Lob
    private byte[] data;
}
