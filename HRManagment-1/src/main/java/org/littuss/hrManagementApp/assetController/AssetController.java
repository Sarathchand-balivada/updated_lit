package org.littuss.hrManagementApp.assetController;

import java.util.List;

import org.littuss.hrManagementApp.assetModel.AssetRegisterEntity;
import org.littuss.hrManagementApp.assetService.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/assets")
public class AssetController {

	@Autowired
	   private AssetService acr;  
	   @PostMapping("/register")
	public AssetRegisterEntity saveAssetRegister(@RequestBody AssetRegisterEntity AssetsRegister) {
	 	return acr.save(AssetsRegister);
	}

//	   @GetMapping("/get/{id}")
//	    public AssetRegisterEntity getAssetById(@PathVariable Long id) {
//	        return acr.getById(id);
//	    }
//
//	    // Get all assets
//	    @GetMapping("/getAll")
//	    public List<AssetRegisterEntity> getAllAssets() {
//	        return acr.getAll();
//	    }
//
//	    @PutMapping("/update/{id}")
//	    public AssetRegisterEntity updateAsset(@PathVariable Long id, @RequestBody AssetRegisterEntity updatedAsset) {
//	        return acr.update(id, updatedAsset);
//	    }
//
//	    // Delete asset by id
//	    @DeleteMapping("/delete/{id}")
//	    public void deleteAsset(@PathVariable Long id) {
//	        acr.delete(id);
//	    }
	}
