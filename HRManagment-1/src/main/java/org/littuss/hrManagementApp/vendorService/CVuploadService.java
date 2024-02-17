package org.littuss.hrManagementApp.vendorService;
//import java.io.IOException;
//import java.util.List;
//import java.util.Optional;
//
////import org.littuss.hrManagementApp.PdfCompresser.CompresserController;
//
//import org.littuss.hrManagementApp.PdfCompresser.CompresserController;
//import org.littuss.hrManagementApp.vendorDetailsModel.CVupload;
////import org.littuss.hrManagementApp.PdfCompresser.compresser;
//import org.littuss.hrManagementApp.vendorDetailsModel.VendorDetails;
//import org.littuss.hrManagementApp.vendorRepo.CVuploadRepo;
//import org.littuss.hrManagementApp.vendorRepo.vendorRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//
//
//
//import java.io.IOException;
//import java.util.Optional;
//
//@Service
//public class CVuploadService {
//
//    @Autowired
//    private CVuploadRepo repository;
//
//    public String uploadFile(MultipartFile file) throws IOException {
//
//    	CVupload cvdata = repository.save(CVupload.builder()
//                .name(file.getOriginalFilename())
//                .type(file.getContentType())
//                .content(CompresserController.compressfile(file.getBytes())).build());
//        if (cvdata != null) {
//            return "file uploaded successfully : " + file.getOriginalFilename();
//        }
//        return null;
//   
//    
//    
////        @PostMapping("/upload")
////        public String handleFileUpload(@RequestParam("file") MultipartFile file) {
////            // Your file upload logic here
////            return "File uploaded successfully!";
////        }
//   }
//
//
//      public byte[] downloadFile(String fileName){
//        Optional<CVupload> dbCVdata = repository.findByName(fileName);
//        byte[] content=CompresserController.decomprele(dbCVdata.get().getcontent());
//        return content;
//    }
//}

		
		//new
import java.io.IOException;
import java.util.Optional;

import org.littuss.hrManagementApp.PdfCompresser.CompresserController;
import org.littuss.hrManagementApp.vendorDetailsModel.CVupload;
import org.littuss.hrManagementApp.vendorRepo.CVuploadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CVuploadService {

    @Autowired
    private CVuploadRepo repository;

    public String uploadFile(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        byte[] content = CompresserController.compressFile(file.getBytes());
        
        CVupload cvUpload = new CVupload();
        cvUpload.setName(fileName);
        cvUpload.setContent(content);
        
        repository.save(cvUpload);
        
        return "File uploaded successfully: " + fileName;
    }

    public ResponseEntity<?> downloadFile(String fileName) throws IOException {
        Optional<CVupload> dbCVdata = repository.findByName(fileName);

        if (dbCVdata.isPresent()) {
            byte[] content = CompresserController.decompressfile(dbCVdata.get().getContent());
            	//////	CompresserController.decompressfile(dbCVdata.get().getContent());
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .body(content);
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("File not found");
        }
    }

    public String deleteFile(String fileName) {
        Optional<CVupload> dbCVdata = repository.findByName(fileName);

        if (dbCVdata.isPresent()) {
            repository.delete(dbCVdata.get());
            return "File deleted successfully: " + fileName;
        } else {
            return "File not found: " + fileName;
        }
    }
}

	
	


