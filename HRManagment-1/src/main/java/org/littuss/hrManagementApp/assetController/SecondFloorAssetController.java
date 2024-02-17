package org.littuss.hrManagementApp.assetController;

import org.littuss.hrManagementApp.assetModel.SecondFloorAssetEntity;
import org.littuss.hrManagementApp.assetService.SecondFloorAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assets")

public class SecondFloorAssetController {
	
	@Autowired

	private SecondFloorAssetService asc;
	
	@PostMapping("/floor")
	public SecondFloorAssetEntity saveAssetRegister(@RequestBody SecondFloorAssetEntity AssetRegister) {
	 	return asc.save(AssetRegister);
	 	
	 	
//	 	
//	 	@GetMapping("/get/{id}")
//	 	public ResponseEntity<?> getClassDataById(@PathVariable Long id){
//	 		try {
//	 		SecondFloorAssestEntity SecondFloorAssestEntity = SecondFloorAssestEntity.findById(id);
//	 		return ResponseEntity.ok(SecondFloorAssestEntity);
//	 		
//	 		}catch(Exception e) {
//	 			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found");
//	 		}
//	 	    }
//	 		
	 		
	
	 	
	 	
//	
//	 	@GetMapping("/get/{id}")
//	 	public ResponseEntity<?> getClassDataById(@PathVariable Long id) {
//	 	try {
//	 	Optional<ClientEntity> SecondFloorAssestEntity = SecondFloorAssestEntity.findById(id);
//	 	return ResponseEntity.ok(clientEntity);
//	 	} catch (Exception e) {
//	 	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found");
//	 	}
//	 	} 	
//	 	
}
	
//	@GetMapping("/floor/get/{id}")
//    public SecondFloorAssetEntity getAssetById(@PathVariable Long id) {
//        return asc.getById(id);
//    }
//
//    // Get all assets
//    @GetMapping("/floor/getAll")
//    public List<SecondFloorAssetEntity> getAllAssets() {
//        return asc.getAll();
//    }
//
//    // Update asset by id
//    @PutMapping("/floor/update/{id}")
//    public SecondFloorAssetEntity updateAsset(@PathVariable Long id, @RequestBody SecondFloorAssetEntity updatedAsset) {
//        return asc.update(id, updatedAsset);
//    }
//
//    // Delete asset by id
//    @DeleteMapping("/floor/delete/{id}")
//    public void deleteAsset(@PathVariable Long id) {
//        asc.delete(id);
//    }
}
