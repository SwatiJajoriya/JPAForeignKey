package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface dbRepo extends JpaRepository<ImageData, Integer> {

public Optional<ImageData> findByName(String filename);
	
}
