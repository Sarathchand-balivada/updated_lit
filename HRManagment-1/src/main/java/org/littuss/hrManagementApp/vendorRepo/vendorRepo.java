package org.littuss.hrManagementApp.vendorRepo;


import java.util.Optional;

import org.littuss.hrManagementApp.vendorDetailsModel.VendorDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface vendorRepo extends JpaRepository<VendorDetails, Long> {

}
