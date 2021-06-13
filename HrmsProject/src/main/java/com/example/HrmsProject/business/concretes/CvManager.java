package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.CoverLetterService;
import com.example.HrmsProject.business.abstracts.CvService;
import com.example.HrmsProject.business.abstracts.EducationService;
import com.example.HrmsProject.business.abstracts.ExperienceService;
import com.example.HrmsProject.business.abstracts.ImageService;
import com.example.HrmsProject.business.abstracts.JobSeekerService;
import com.example.HrmsProject.business.abstracts.LanguageService;
import com.example.HrmsProject.business.abstracts.SkillService;
import com.example.HrmsProject.business.abstracts.SocialMediaLinkService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessDataResult;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.dataAccess.abstracts.CvDao;
import com.example.HrmsProject.entities.concretes.Cv;
import com.example.HrmsProject.entities.dtos.CvDto;


@Service
public class CvManager implements CvService {

	private CvDao cvDao;
	private CoverLetterService coverLetterService;
	private EducationService educationService;
	private ExperienceService experienceService;
	private ImageService imageService;
	private LanguageService languageService;
	private SkillService skillService;
	private SocialMediaLinkService socialMediaLinkService;
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public CvManager(CvDao cvDao, CoverLetterService coverLetterService, EducationService educationService,
			ExperienceService experienceService, ImageService imageService, LanguageService languageService,
			SkillService skillService, SocialMediaLinkService socialMediaLinkService,
			JobSeekerService jobSeekerService) {
		super();
		this.cvDao = cvDao;
		this.coverLetterService = coverLetterService;
		this.educationService = educationService;
		this.experienceService = experienceService;
		this.imageService = imageService;
		this.languageService = languageService;
		this.skillService = skillService;
		this.socialMediaLinkService = socialMediaLinkService;
		this.jobSeekerService = jobSeekerService;
	}

	

	@Override
	public Result add(Cv cv) {
		// TODO Auto-generated method stub
		this.cvDao.save(cv);
		return new SuccessResult("Cv başarıyla eklendi");
	}

	@Override
	public Result update(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("Cv başarıyla eklendi");
	}

	@Override
	public Result delete(int id) {
		this.cvDao.deleteById(id);
		return new SuccessResult("Cv başarıyla eklendi");
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		return new SuccessDataResult<List<Cv>>(this.cvDao.findAll());
	}

	@Override
	public DataResult<Cv> getById(int id) {
		return new SuccessDataResult<Cv>(this.cvDao.getById(id));
	}

	@Override
	public DataResult<CvDto> getCvById(int id) {
		Cv cv=this.cvDao.getById(id);
		CvDto cvDto=new CvDto();
		cvDto.experiences=this.experienceService.getAllByCv_id(id).getData();
		cvDto.image=this.imageService.getByCv_id(id).getData();
		cvDto.educations=this.educationService.getAllByCv_idOrderByEndTimeDesc(id).getData();
		cvDto.languages=this.languageService.getAllByCv_id(id).getData();
		cvDto.coverLetters=this.coverLetterService.getAllByCv_id(id).getData();
		cvDto.skills=this.skillService.getAllByCv_id(id).getData();
		cvDto.socialMediaLinks=this.socialMediaLinkService.getAllByCv_id(id).getData();
		cvDto.jobseeker=this.jobSeekerService.getById(id).getData();
		return new SuccessDataResult<CvDto>(cvDto);
	}

}
