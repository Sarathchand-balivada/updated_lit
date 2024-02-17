package org.littuss.hrManagementApp.itRecruitmentController;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateDTO;
import org.littuss.hrManagementApp.itRecruitmentService.ItRecruitmentCandidateDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/itrecruitment")
public class ItRecruitmentCandidateController {
	
	@Autowired
	private ItRecruitmentCandidateDetailsService itRecruitmentCandidateDetailsService;
	
	@PostMapping("/save/candidate")
	public void saveClassData(@RequestBody ItRecruitmentCandidateDTO itDto) {
		itRecruitmentCandidateDetailsService.saveData(itDto);
		
	}
	
	
}
