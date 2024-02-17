package org.littuss.hrManagementApp.clientService;

import java.util.List;

import org.littuss.hrManagementApp.clientModel.ClientEntity;
import org.littuss.hrManagementApp.clientRepository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clr;
	
//	 public ClientEntity findByemailId (String emailId) {
//		return clr.findByemailId(emailId);
//	}
	 public ClientEntity save(ClientEntity ser) {
		return  clr.save(ser);
	}
//	
//	 public List<ClientEntity> getAll() {
//	        return clr.findAll();
//	    }
//
//	    public ClientEntity update(Long id, ClientEntity updatedClient) {
//	        return clr.update(id,updatedClient);
//	    }
//
//	    public void delete(Long id) {
//	        clr.deleteById(id);
//	    }
	}



