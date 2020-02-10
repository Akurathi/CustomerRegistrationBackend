//package com.example.homework1.controller;
//
//import com.example.homework1.service.StorageService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
////import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//@RestController
//public class FileUploaderController {
//
//    @Autowired
//    private StorageService storageService;
//
//    @RequestMapping(value = "/doUpload", method = RequestMethod.POST,
//            consumes = {"multipart/form-data"})
//    public String upload(@RequestParam MultipartFile file) throws Exception {
//
//        storageService.uploadFile(file);
//
//        return "redirect:/success.html";
//    }
//
////    @ExceptionHandler(StorageException.class)
////    public String handleStorageFileNotFound(StorageException e) {
////
////        return "redirect:/failure.html";
////    }
//}
