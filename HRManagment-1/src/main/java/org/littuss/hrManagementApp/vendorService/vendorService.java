package org.littuss.hrManagementApp.vendorService;

import java.util.List;
import java.util.Optional;

import org.littuss.hrManagementApp.vendorDetailsModel.VendorDetails;
import org.littuss.hrManagementApp.vendorRepo.vendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class vendorService {

	@Autowired
	private vendorRepo venRepo;
	
//	 public VendorDetails findByvendorName(String vendorName) {
//	        return venRepo.findByvendorName(vendorName);
//	 }
	 public VendorDetails save(VendorDetails vedInfo) {
	        return venRepo.save(vedInfo);
	 }      
	
	 public Optional<VendorDetails> findById (Long id) {
	        return venRepo.findById(id);
	    }
	 
	 public Optional<VendorDetails> getById(Long id) {
	        return venRepo.findById(id);
	    }


	}




