package org.littuss.hrManagementApp.LoginIconRepository;

import org.littuss.hrManagementApp.loginIconEntity.LoginIconEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginIconRep extends JpaRepository<LoginIconEntity, Long> {
	
	
	

}
