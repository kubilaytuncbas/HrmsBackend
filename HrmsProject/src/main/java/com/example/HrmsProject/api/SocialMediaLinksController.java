package com.example.HrmsProject.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.SocialMediaLinkService;

@RestController
@RequestMapping("/api/socialMediaLinks")
public class SocialMediaLinksController {
	private SocialMediaLinkService socialMediaLinkService;

	public SocialMediaLinksController(SocialMediaLinkService socialMediaLinkService) {
		super();
		this.socialMediaLinkService = socialMediaLinkService;
	}

}
