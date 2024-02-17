package org.littuss.hrManagementApp.loginIconController;

import java.util.List;
import java.util.Optional;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;
import org.littuss.hrManagementApp.loginIconEntity.LoginIconEntity;
import org.littuss.hrManagementApp.loginIconService.LoginIconService;
import org.littuss.hrManagementApp.vendorDetailsModel.VendorDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usericon")
public class LoginIconController {
	
	@Autowired
	private LoginIconService  icon;

//
//	    @PostMapping("/save")
//	    public LoginIconEntity createUser(@RequestBody LoginIconEntity user) {
//	        return icon.save(user);
//	    }
	
	@PostMapping("/save")
	 public LoginIconEntity saveLoginIconEntity(@RequestBody LoginIconEntity LoginIconEntity) {
		return icon.save(LoginIconEntity);
   }

	    @GetMapping("/get")
	    public List<LoginIconEntity> getAllUsers() {
	        return icon.findAll();
	        
//	        
//	        @GetMapping("/get/{id}")
//	        public ResponseEntity<?> getClassDataById(@PathVariable Long id) {
//	            try {
//	                Optional<VendorDetails> vendorDetails = venDet.findById(id);
//	                return ResponseEntity.ok(vendorDetails);
//	            } catch (Exception e) {
//	                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found");
//	            }
//	        }
	

	    }
	    }
