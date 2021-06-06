package com.example.HrmsProject.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.LanguageService;

@RestController
@RequestMapping("/api/coverLetters")
public class LanguagesController {

	private LanguageService languageService;

	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
}
