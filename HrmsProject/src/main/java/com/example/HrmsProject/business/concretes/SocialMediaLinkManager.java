package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.SocialMediaLinkService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessDataResult;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.dataAccess.abstracts.SocialMediaLinkDao;
import com.example.HrmsProject.entities.concretes.SocialMediaLink;

@Service
public class SocialMediaLinkManager implements SocialMediaLinkService {

	private SocialMediaLinkDao socialMediaLinkDao;
	
	@Autowired
	public SocialMediaLinkManager(SocialMediaLinkDao socialMediaLinkDao) {
		super();
		this.socialMediaLinkDao = socialMediaLinkDao;
	}

	@Override
	public Result add(SocialMediaLink socialMediaLink) {
		this.socialMediaLinkDao.save(socialMediaLink);
		return new SuccessResult("Başarıyla Eklendi");
	}

	@Override
	public Result update(SocialMediaLink socialMediaLink) {
		this.socialMediaLinkDao.save(socialMediaLink);
		return new SuccessResult("Başarıyla güncellendi");
	}

	@Override
	public Result delete(SocialMediaLink socialMediaLink) {
		this.socialMediaLinkDao.delete(socialMediaLink);
		return new SuccessResult("Başarıyla silindi.");
	}

	@Override
	public DataResult<List<SocialMediaLink>> getAll() {
		return new SuccessDataResult<List<SocialMediaLink>>(this.socialMediaLinkDao.findAll(), "Başarıyla listelendi");
	}

	@Override
	public DataResult<List<SocialMediaLink>> getAllByCv_id(int id) {
		return new SuccessDataResult<List<SocialMediaLink>>(this.socialMediaLinkDao.getAllByCv_id(id), "Başarıyla listelendi");
	}

}
