package org.littuss.hrManagementApp.requirementService;

import org.springframework.stereotype.Service;

import java.util.List;

import org.littuss.hrManagementApp.requirementModel.requirementEntity;
import org.littuss.hrManagementApp.requirementRepository.requirementRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class requirementService {
	
	@Autowired
	private requirementRepository rRS;
	public requirementEntity save(requirementEntity rre) {
		return rRS.save(rre);
	}
	
//	public requirementEntity getById(Long id) {
//        return rRS.getById(id);
//        
//	}
//	
//    public List<requirementEntity> getAll() {
//      
//        return rRS.findAll();
//    }
//
//    public requirementEntity update(Long id, requirementEntity updatedEntity) {
//       return rRS.update(id,updatedEntity);      
//    }
//
//    public void delete(Long id) {
//        
//        rRS.deleteById(id);
//    }
}
