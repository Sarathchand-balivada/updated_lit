package org.littuss.hrManagementApp.itRecruitmentRepository;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateNormalizedData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItRecruitmentRepository extends JpaRepository<ItRecruitmentCandidateNormalizedData, Long> {

		ItRecruitmentCandidateNormalizedData save(ItRecruitmentCandidateNormalizedData itRecruitmentCandidateNormalizedData);
	
	
}



