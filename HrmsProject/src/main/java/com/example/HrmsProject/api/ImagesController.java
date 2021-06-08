package com.example.HrmsProject.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.HrmsProject.business.abstracts.CvService;
import com.example.HrmsProject.business.abstracts.ImageService;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Cv;
import com.example.HrmsProject.entities.concretes.Image;

@RestController
@RequestMapping("/api/images")
public class ImagesController {
	
	private ImageService imageService;
	private CvService cvService;

	@Autowired	
	public ImagesController(ImageService imageService,CvService cvService) {
		super();
		this.imageService = imageService;
		this.cvService=cvService;
	}
	@PostMapping(value="/add")
	public Result add(@RequestBody MultipartFile imageFile,@RequestParam int id) {
		Cv cv=this.cvService.getById(id).getData();
		Image image=new Image();
		image.setCv(cv);
		return this.imageService.add(image, imageFile);
	}
	@PostMapping("/update")
	public Result update(@RequestBody Image image) {
		return this.imageService.update(image);
	}

}
