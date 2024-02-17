package org.littuss.hrManagementApp.vendorController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.littuss.hrManagementApp.vendorDetailsModel.VendorDetails;
import org.littuss.hrManagementApp.vendorRepo.vendorRepo;
import org.littuss.hrManagementApp.vendorService.vendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vendorDetails")
public class vendorController {

	@Autowired
	private vendorService venDet;
	
	@PostMapping("/save/vendorName")
	 public VendorDetails saveVendorDetails(@RequestBody VendorDetails VendorDetails) {
		return venDet.save(VendorDetails);
    }
	
	
 
//	@GetMapping("/get/{id}")
//    public Optional<VendorDetails> getVendorDetailsById1(@PathVariable Long id) {
//        return venDet.getById(id);
//    }
//
//   
//	@GetMapping("/get/{id}")
//    public ResponseEntity<?> getVendorDetailsById(@PathVariable Long id) {
//        Optional<VendorDetails> vendorDetails = venDet.getById(id);
//        return vendorDetails.map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
	

	
//	@GetMapping("/getAll")
//    public ResponseEntity<List<VendorDetails>> getAllVendorDetails(@RequestParam(required = false) String vendorName) {
//        try {
//            List<VendorDetails> vendorDetailsList = new ArrayList<>();
//
//            if (vendorName == null) {
//                venDet.getAll().forEach(vendorDetailsList::add);
//            } else {
//                venDet.getByVendorName(vendorName).ifPresent(vendorDetailsList::add);
//            }
//
//            if (vendorDetailsList.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//
//            return new ResponseEntity<>(vendorDetailsList, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

	@GetMapping("/get/{id}")
    public ResponseEntity<?> getClassDataById(@PathVariable Long id) {
        try {
            Optional<VendorDetails> vendorDetails = venDet.findById(id);
            return ResponseEntity.ok(vendorDetails);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found");
        }
    }
    
   
}

