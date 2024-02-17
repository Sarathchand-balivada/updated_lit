package org.littuss.hrManagementApp.itRecruitmentService;


import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateDTO;
import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateNormalizedData;
import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentClientSideDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentInterviewDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentScreeningDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentStatusEntity;
import org.littuss.hrManagementApp.itRecruitmentRepository.ItRecruitmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItRecruitmentCandidateDetailsService {
	
	@Autowired
	private ItRecruitmentRepository itRecruitmentRepository; 
	
	public ItRecruitmentCandidateNormalizedData saveData (ItRecruitmentCandidateDTO itrecruitmentDto)
	{
		ItRecruitmentCandidateDetailsEntity candidatedetailsentity = new ItRecruitmentCandidateDetailsEntity();
		ItRecruitmentClientSideDetailsEntity clientsidedetailsentity = new ItRecruitmentClientSideDetailsEntity();
		ItRecruitmentInterviewDetailsEntity interviewdetailsentity = new ItRecruitmentInterviewDetailsEntity();
		ItRecruitmentScreeningDetailsEntity screeningdetailsentity = new ItRecruitmentScreeningDetailsEntity();
		ItRecruitmentStatusEntity statusentity = new ItRecruitmentStatusEntity();
		
		 BeanUtils.copyProperties(itrecruitmentDto,candidatedetailsentity);
		 BeanUtils.copyProperties(itrecruitmentDto,clientsidedetailsentity);
		 BeanUtils.copyProperties(itrecruitmentDto,interviewdetailsentity);
		 BeanUtils.copyProperties(itrecruitmentDto,screeningdetailsentity);
		 BeanUtils.copyProperties(itrecruitmentDto,statusentity);

		 ItRecruitmentCandidateNormalizedData normalizedData = new ItRecruitmentCandidateNormalizedData();
		 normalizedData.setItRecruitmentClientSideDetailsEntity(clientsidedetailsentity);
		 normalizedData.setItRecruitmentClientSideDetailsEntity(clientsidedetailsentity);
		 normalizedData.setItRecruitmentInterviewDetailsEntity(interviewdetailsentity);
		 normalizedData.setItRecruitmentScreeningDetailsEntity(screeningdetailsentity);
		 normalizedData.setItRecruitmentStatusEntity(statusentity);

		 return itRecruitmentRepository.save(normalizedData);
	}
}