package org.littuss.hrManagementApp.loginIconService;

import java.util.List;
import java.util.Optional;

import org.littuss.hrManagementApp.LoginIconRepository.LoginIconRep;import org.littuss.hrManagementApp.loginIconEntity.LoginIconEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LoginIconService {
    @Autowired
	private LoginIconRep LIrepo; 

	public LoginIconEntity save(LoginIconEntity userIcon) {			
		return LIrepo.save(userIcon);
		}  

    public LoginIconEntity createUser(LoginIconEntity user) {
        // You can perform additional logic/validation before saving the user
        return LIrepo.save(user);
    }

    public List<LoginIconEntity> getAllUsers() {
        return LIrepo.findAll();
    }

    public Optional<LoginIconEntity> getUserById(Long userId) {
        return LIrepo.findById(userId);
    }

    public LoginIconEntity updateUser(Long userId, LoginIconEntity updatedUser) {
        Optional<LoginIconEntity> existingUserOptional = LIrepo.findById(userId);

        if (existingUserOptional.isPresent()) {
        	LoginIconEntity existingUser = existingUserOptional.get();

            // Update the fields you want to allow modification
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setFullName(updatedUser.getFullName());
            existingUser.setLastLoginTime(updatedUser.getLastLoginTime());

            return LIrepo.save(existingUser);
        } else {
            // Handle the case where the user with the given ID is not found
            throw new RuntimeException("User not found with id: " + userId);
        }
    }

    public void deleteUser(Long userId) {
    	LIrepo.deleteById(userId);
    }

	public java.util.List<LoginIconEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}

