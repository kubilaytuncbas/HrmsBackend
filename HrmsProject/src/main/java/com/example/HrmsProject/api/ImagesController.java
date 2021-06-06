package com.example.HrmsProject.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.HrmsProject.business.abstracts.ImageService;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Image;

@RestController
@RequestMapping("/api/images")
public class ImagesController {
	
	private ImageService imageService;

	@Autowired	
	public ImagesController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody MultipartFile imageFile,@RequestParam int id) {
		Image image=new Image();
		return this.imageService.add(image, imageFile);
	}

}
