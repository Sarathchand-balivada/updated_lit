package org.littuss.hrManagementApp.internRegisterController;

import org.littuss.hrManagementApp.internRegisterModel.InternDTO;
import org.littuss.hrManagementApp.internRegisterService.InternRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/intern/register")
public class InternRegisterController {

	@Autowired
	private InternRegisterService internRegisterService;
	
	@PostMapping("/save")
    public String saveClassData(@RequestBody InternDTO internDto) {
		internRegisterService.saveData(internDto);
        return "Data saved successfully";
    }
}
