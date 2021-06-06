package com.example.HrmsProject.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.SkillService;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {
	private SkillService skillService;

	public SkillsController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}

}
