package org.littuss.hrManagementApp.assetRepository;

import org.littuss.hrManagementApp.assetModel.AssetRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<AssetRegisterEntity, Long>{

//	AssetRegisterEntity update(Long id, AssetRegisterEntity updatedAsset);
//
//	//AssetRegisterEntity update(Long id, AssetRegisterEntity updatedAsset);
//	
//	@Modifying
//    @Query("UPDATE AssetRegisterEntity a SET a.normalChairs = :normalChairs WHERE a.id = :id")
//    void updateNormalChairsById(Long id, String normalChairs);
    
}