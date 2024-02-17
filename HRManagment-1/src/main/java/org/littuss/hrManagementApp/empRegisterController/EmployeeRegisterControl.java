package org.littuss.hrManagementApp.empRegisterController;

import org.littuss.hrManagementApp.empRegisterModel.EmployeeDTO;
import org.littuss.hrManagementApp.empRegisterService.EmployeeRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/employee/register")
public class EmployeeRegisterControl {
	 @Autowired
	 private EmployeeRegisterService registerService;
	 
	 @PostMapping("/save")
	    public String saveClassData(@RequestBody EmployeeDTO empDto) {
		 registerService.saveData(empDto);
	        return "Data saved successfully";
	    }


}

