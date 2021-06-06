package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.SocialMediaLinkService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(SocialMediaLink socialMediaLink) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(SocialMediaLink socialMediaLink) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<SocialMediaLink>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
