//package com.example.homework1.service;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//
//
//@Service
//    public class StorageService {
//
//        @Value("${upload.path}")
//        private String path;
//
//        public void uploadFile(MultipartFile file) throws Exception {
//
//            if (file.isEmpty()) {
//                System.out.println("Failed to store empty file");
//            }
//
//            try {
//                var fileName = file.getOriginalFilename();
//                var is = file.getInputStream();
//
//                System.out.println(is);
//
//                Files.copy(is, Paths.get(path + fileName),
//                        StandardCopyOption.REPLACE_EXISTING);
//            } catch (IOException e) {
//
//                var msg = String.format("Failed to store file", file.getName());
//                System.out.println("Storage exception");
//
//                throw new Exception(msg, e);
//            }
//
//        }
//    }
//
//
