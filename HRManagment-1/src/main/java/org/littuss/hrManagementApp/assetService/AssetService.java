package org.littuss.hrManagementApp.assetService;

import java.util.List;

import org.littuss.hrManagementApp.assetModel.AssetRegisterEntity;
import org.littuss.hrManagementApp.assetRepository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssetService {
	
	@Autowired
	public AssetRepository asr;
	 public AssetRegisterEntity save(AssetRegisterEntity ser) {
		return  asr.save(ser);
	}
	
//	 public AssetRegisterEntity getById(Long id) {
//	        return asr.getById(id);
//	    }
//
//	    public List<AssetRegisterEntity> getAll() {
//	        return asr.findAll();
//	    }
//
//	    public AssetRegisterEntity update(Long id, AssetRegisterEntity updatedAsset) {
//	     return asr.update(id,updatedAsset);
//	    }
//
//	    public void delete(Long id) {
//	        asr.deleteById(id);
//	    }
	}