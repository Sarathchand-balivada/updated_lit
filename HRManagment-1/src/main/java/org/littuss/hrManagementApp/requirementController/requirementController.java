package org.littuss.hrManagementApp.requirementController;

import java.util.List;

import org.littuss.hrManagementApp.requirementModel.requirementEntity;
import org.littuss.hrManagementApp.requirementService.requirementService;
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
@RequestMapping("/requirement")
public class requirementController {
	
	@Autowired
	private requirementService rService;
	
	@PostMapping("/save/technology")
	public requirementEntity addRequirement(@RequestBody requirementEntity rre) {
        return rService.save(rre);
    }

//	@GetMapping("/get/{id}")
//    public requirementEntity getRequirementById(@PathVariable Long id) {
//        return rService.getById(id);
//    }
//
//    @GetMapping("/getAll")
//    public List<requirementEntity> getAllRequirements() {
//        return rService.getAll();
//    }
//
//    @PutMapping("/update/{id}")
//    public requirementEntity updateRequirement(@PathVariable Long id, @RequestBody requirementEntity updatedEntity) {
//        return rService.update(id, updatedEntity);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void deleteRequirement(@PathVariable Long id) {
//        rService.delete(id);
//    }
}



