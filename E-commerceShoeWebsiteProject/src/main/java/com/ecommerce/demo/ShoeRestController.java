package com.ecommerce.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



@RestController
public class ShoeRestController {
	
	@Autowired
	ShoeDAO dao;
	
	@PostMapping("/insert")
public ShoeData insert(@RequestBody ShoeData s) {
		
		return dao.insert(s);
	}

	//@PostMapping("/uploading")
	//public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file) throws IOException{
	//	String response=dao.uploadImage(file);
		//return ResponseEntity.status(HttpStatus.OK).body(response);
//	}
}
