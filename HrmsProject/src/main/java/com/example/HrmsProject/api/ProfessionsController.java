package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.ProfessionService;
import com.example.HrmsProject.entities.concretes.Profession;

@RestController
@RequestMapping("/api/professions")
public class ProfessionsController {

	private ProfessionService professionService;
	
		@Autowired
		public ProfessionsController(ProfessionService professionService) {
		super();
		this.professionService = professionService;
	}

		@GetMapping("/getall")
		public List<Profession> getAll()
		{
			return this.professionService.getAll();			
		}
}
