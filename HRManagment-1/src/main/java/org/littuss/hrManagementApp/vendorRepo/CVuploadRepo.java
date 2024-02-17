package org.littuss.hrManagementApp.vendorRepo;

import java.util.Optional;

import org.littuss.hrManagementApp.vendorDetailsModel.CVupload;

//import java.util.Optional;
//import org.littuss.hrManagementApp.vendorDetailsModel.CVupload;
//import org.littuss.hrManagementApp.vendorDetailsModel.VendorDetails;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//	@Repository
//	public interface CVuploadRepo  extends JpaRepository<CVupload,Long> { 
//
//		Optional<CVupload> findByName(String fileName);
//	}
		
//new
import org.springframework.data.jpa.repository.JpaRepository;

public interface CVuploadRepo extends JpaRepository<CVupload, Long> {

    Optional<CVupload> findByName(String name);
}