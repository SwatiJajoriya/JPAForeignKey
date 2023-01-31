package com.ecommerce.demo;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ShoeDAO {
	
	@Autowired
	ShoeRepo repo;
	
public ShoeData insert(ShoeData s) {
		
		return repo.save(s);
	}

//private final String FOLDER_PATH="D:\\Project image\\";

//public String uploadImage(MultipartFile file) throws IOException {
	//ShoeData data=new ShoeData();
	//String fileinfo=FOLDER_PATH+file.getOriginalFilename();
	//data.setImagefilePath(fileinfo);
	//ShoeData res=repo.save(data);
	//file.transferTo(new File(fileinfo));
	//if(res!=null) {
	//return	"file path is uploaded into the dB successfully.."+file.getOriginalFilename();
//	}
	//return null;
//}
}
