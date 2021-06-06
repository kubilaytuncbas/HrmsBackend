package com.example.HrmsProject.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.ExperienceService;

@RestController
@RequestMapping("/api/experiences")
public class ExperiencesController {
	private ExperienceService experienceService;

	public ExperiencesController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}

}
