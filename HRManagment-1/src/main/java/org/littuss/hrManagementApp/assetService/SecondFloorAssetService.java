package org.littuss.hrManagementApp.assetService;

import java.util.List;

import org.littuss.hrManagementApp.assetModel.SecondFloorAssetEntity;
import org.littuss.hrManagementApp.assetRepository.SecondFloorAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondFloorAssetService {
	@Autowired 
	 private SecondFloorAssetRepository asf; 
	public SecondFloorAssetEntity save(SecondFloorAssetEntity ser) {
		return  asf.save(ser);
	} 

//	public SecondFloorAssetEntity getById(Long id) {
//        return asf.getById(id);
//    }

//    public List<SecondFloorAssetEntity> getAll() {
//        return asf.findAll();
//    }
//
//    public SecondFloorAssetEntity update(Long id, SecondFloorAssetEntity updatedAsset) {
//    	return asf.update(id,updatedAsset);
//    }
//
//    public void delete(Long id) {
//        asf.deleteById(id);
//    }
}