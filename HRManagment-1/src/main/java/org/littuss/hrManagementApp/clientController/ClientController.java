package org.littuss.hrManagementApp.clientController;

import java.util.List;

import org.littuss.hrManagementApp.clientModel.ClientEntity;
import org.littuss.hrManagementApp.clientService.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")

public class ClientController {
	
	 @Autowired
	 private ClientService csr;

//	// Get client by emailId
//	    @GetMapping("/get/{emailId}")
//	    public ClientEntity getClientByEmailId(@PathVariable String emailId) {
//	        return csr.findByemailId(emailId);
//	    }
//
//	    // Get all clients
//	    @GetMapping("/getAll")
//	    public List<ClientEntity> getAllClients() {
//	        return csr.getAll();
//	    }
//
//	    // Save or update client
    @PostMapping("/save")
    public ClientEntity saveOrUpdateClient(@RequestBody ClientEntity clientEntity) {
        return csr.save(clientEntity);
	    }
//
//	    // Update client by id
//	    @PutMapping("/update/{id}")
//	    public ClientEntity updateClient(@PathVariable Long id, @RequestBody ClientEntity updatedClient) {
//	        return csr.update(id, updatedClient);
//	    }
//
//	    // Delete client by id
//	    @DeleteMapping("/delete/{id}")
//	    public void deleteClient(@PathVariable Long id) {
//	        csr.delete(id);
//	    }
	}