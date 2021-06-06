package com.example.HrmsProject.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.CvService;

@RestController
@RequestMapping("/api/cvs")
public class CvsController {
	
	private CvService cvService;

	public CvsController(CvService cvService) {
		super();
		this.cvService = cvService;
	}
}
