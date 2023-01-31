package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImageData {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String type;
@Lob
@Column(name = "imagedata")
	private byte[] imageData;
	
}


