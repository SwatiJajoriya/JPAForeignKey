package com.example.demo;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

	@Autowired
	FileRepo repo;
	private final String FOLDER_PATH="D:\\Project image\\";
	
	public String uploadImage(MultipartFile file) throws IOException {
		FileData data=new FileData();
		String fileinfo=FOLDER_PATH+file.getOriginalFilename();
		data.setName(file.getOriginalFilename());
		data.setType(file.getContentType());
		data.setFilePath(fileinfo);
		FileData res=repo.save(data);
		file.transferTo(new File(fileinfo));
		if(res!=null) {
		return	"file path is uploaded into the dB successfully.."+file.getOriginalFilename();
		}
		return null;
	}
	
	
	public byte[] downloadImage(String filename) throws DataFormatException, IOException {
		Optional<FileData> fileimg=repo.findByName(filename);
		                //object of FileData
		String filePath=fileimg.get().getFilePath();
		byte[] images=Files.readAllBytes(new File(filePath).toPath());
		return images;
		
	}
	
}

