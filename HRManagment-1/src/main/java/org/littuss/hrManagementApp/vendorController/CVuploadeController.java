package org.littuss.hrManagementApp.vendorController;

import java.io.IOException;

import org.littuss.hrManagementApp.vendorService.CVuploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

//
//import org.littuss.hrManagementApp.vendorService.CVuploadService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//
//
//@SpringBootApplication
//@RestController
//@RequestMapping("/Pdf")
//public class CVuploadeController {
//
//	@Autowired
//	private CVuploadService service;
//
//	@PostMapping()
//	public ResponseEntity<?> uploadfile(@RequestParam("image")MultipartFile file) throws IOException {
//		String uploadImage = service.uploadFile(file);
//		return ResponseEntity.status(HttpStatus.OK)
//				.body(uploadImage);
//	}
//
//	@GetMapping("/{fileName}")
//	public ResponseEntity<?> downloadFile(@PathVariable String fileName){
//		byte[] content=service.downloadFile(fileName);
//		return ResponseEntity.status(HttpStatus.OK)
//				.contentType(MediaType.valueOf("Pdf/docx"))
//				.body(content);
//
//	}
//}
	//new
@RestController
@RequestMapping("/resume")
public class CVuploadeController {

    @Autowired
    private CVuploadService service;

    @PostMapping
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        String response = service.uploadFile(file);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/download/{fileName}")
    public ResponseEntity<?> downloadFile(@PathVariable String fileName) throws IOException {
        return service.downloadFile(fileName);
    }

    @DeleteMapping("/delete/{fileName}")
    public ResponseEntity<?> deleteFile(@PathVariable String fileName) {
        String response = service.deleteFile(fileName);
        return ResponseEntity.ok(response);
    }
}

	
	
	
	
	
	
	
	


