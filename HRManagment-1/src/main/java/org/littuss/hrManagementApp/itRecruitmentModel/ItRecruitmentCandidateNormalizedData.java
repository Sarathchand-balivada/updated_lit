package org.littuss.hrManagementApp.itRecruitmentModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ItRecruitmentCandidateNormalizedData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 private Long itrecruitmentId;
	
	 @OneToOne(cascade = CascadeType.ALL)
	 private ItRecruitmentCandidateDetailsEntity itRecruitmentCandidateDetailsEntity;
	
	 @OneToOne(cascade = CascadeType.ALL)
	 private ItRecruitmentClientSideDetailsEntity itRecruitmentClientSideDetailsEntity;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 private ItRecruitmentInterviewDetailsEntity itRecruitmentInterviewDetailsEntity;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 private ItRecruitmentScreeningDetailsEntity itRecruitmentScreeningDetailsEntity;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 private ItRecruitmentStatusEntity itRecruitmentStatusEntity;

	public ItRecruitmentCandidateNormalizedData() {

	}

	public ItRecruitmentCandidateNormalizedData(Long itrecruitmentId,
			ItRecruitmentCandidateDetailsEntity itRecruitmentCandidateDetailsEntity,
			ItRecruitmentClientSideDetailsEntity itRecruitmentClientSideDetailsEntity,
			ItRecruitmentInterviewDetailsEntity itRecruitmentInterviewDetailsEntity,
			ItRecruitmentScreeningDetailsEntity itRecruitmentScreeningDetailsEntity,
			ItRecruitmentStatusEntity itRecruitmentStatusEntity) {
		super();
		this.itrecruitmentId = itrecruitmentId;
		this.itRecruitmentCandidateDetailsEntity = itRecruitmentCandidateDetailsEntity;
		this.itRecruitmentClientSideDetailsEntity = itRecruitmentClientSideDetailsEntity;
		this.itRecruitmentInterviewDetailsEntity = itRecruitmentInterviewDetailsEntity;
		this.itRecruitmentScreeningDetailsEntity = itRecruitmentScreeningDetailsEntity;
		this.itRecruitmentStatusEntity = itRecruitmentStatusEntity;
	}

	public Long getItrecruitmentId() {
		return itrecruitmentId;
	}

	public ItRecruitmentCandidateDetailsEntity getItRecruitmentCandidateDetailsEntity() {
		return itRecruitmentCandidateDetailsEntity;
	}

	public ItRecruitmentClientSideDetailsEntity getItRecruitmentClientSideDetailsEntity() {
		return itRecruitmentClientSideDetailsEntity;
	}

	public ItRecruitmentInterviewDetailsEntity getItRecruitmentInterviewDetailsEntity() {
		return itRecruitmentInterviewDetailsEntity;
	}

	public ItRecruitmentScreeningDetailsEntity getItRecruitmentScreeningDetailsEntity() {
		return itRecruitmentScreeningDetailsEntity;
	}

	public ItRecruitmentStatusEntity getItRecruitmentStatusEntity() {
		return itRecruitmentStatusEntity;
	}

	public void setItrecruitmentId(Long itrecruitmentId) {
		this.itrecruitmentId = itrecruitmentId;
	}

	public void setItRecruitmentCandidateDetailsEntity(
			ItRecruitmentCandidateDetailsEntity itRecruitmentCandidateDetailsEntity) {
		this.itRecruitmentCandidateDetailsEntity = itRecruitmentCandidateDetailsEntity;
	}

	public void setItRecruitmentClientSideDetailsEntity(
			ItRecruitmentClientSideDetailsEntity itRecruitmentClientSideDetailsEntity) {
		this.itRecruitmentClientSideDetailsEntity = itRecruitmentClientSideDetailsEntity;
	}

	public void setItRecruitmentInterviewDetailsEntity(
			ItRecruitmentInterviewDetailsEntity itRecruitmentInterviewDetailsEntity) {
		this.itRecruitmentInterviewDetailsEntity = itRecruitmentInterviewDetailsEntity;
	}

	public void setItRecruitmentScreeningDetailsEntity(
			ItRecruitmentScreeningDetailsEntity itRecruitmentScreeningDetailsEntity) {
		this.itRecruitmentScreeningDetailsEntity = itRecruitmentScreeningDetailsEntity;
	}

	public void setItRecruitmentStatusEntity(ItRecruitmentStatusEntity itRecruitmentStatusEntity) {
		this.itRecruitmentStatusEntity = itRecruitmentStatusEntity;
	}

	 
	 

}
	