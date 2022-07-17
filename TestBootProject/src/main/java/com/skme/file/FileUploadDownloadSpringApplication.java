package com.skme.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.skme.file.service.FileStorageService;

@SpringBootApplication
public class FileUploadDownloadSpringApplication implements CommandLineRunner{
	
	@Autowired
	FileStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(FileUploadDownloadSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		storageService.deleteAll();
		storageService.init();	
	}

}
