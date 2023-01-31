package com.example.demo;

import java.io.IOException;
import java.util.Optional;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class dbService {

	@Autowired
	dbRepo repo;
	                         //abc.png
	public String uploadImage(MultipartFile file) throws IOException {
		ImageData data=new ImageData();
		data.setName(file.getOriginalFilename());
		data.setType(file.getContentType());
		data.setImageData(ImageUtil.compressImage(file.getBytes()));
		ImageData res=repo.save(data);
		if(res!=null) {
			return "file is uploaded into the dB successfully.."+file.getOriginalFilename();
		}
		return null;
		
	}
	
	                                //abc
	public byte[] downloadImage(String filename) throws DataFormatException {
		Optional<ImageData> dbimg=repo.findByName(filename);
		byte[] originalimage=ImageUtil.decompressImage(dbimg.get().getImageData());
		return originalimage;
		
	}


}
